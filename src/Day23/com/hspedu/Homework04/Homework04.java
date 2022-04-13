package Day23.com.hspedu.Homework04;
/**基于类的匿名内部类
 *
 * 定义一个接口，写一个方法
 * 创建一个类，写一个方法 去调用接口的方法，该类的方法需要传入接口类型参数，传入的接口参数就是匿名内部类
 *      那么问题来了，为什么需要 传入匿名内部类呢？？？
 *      答案就是，直接通过匿名内部类 重写接口的方法，而不需要新建一个类去实现这个接口的方法
 *      所以用起来很便捷
 */
public class Homework04 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();


        /**
         * 基于类的匿名内部类
         * 1.   new ICalculator() {
         *             @Override
         *             public double work(double n1, double n2) {
         *
         *                 return n1+n2;
         *             }
         *       这就是一个匿名内部类
         *
         *       我们看底层 ：匿名类实现了该接口，并重写了接口的方法，打包成匿名内部类 传递出去
         *          *            class 匿名名称  implements ICalculator() {
         *          *             @Override
         *          *             public double work(double n1, double n2) {
         *          *
         *          *                 return n1+n2;
         *          *             }
         *
         *  2.匿名内部类 同时也是一个对象
         *  3.编译类型是接口类型，运行类型是匿名内部类
         *  4.这里接口没有实例化，而是实现了接口的匿名内部类的实例化
         */
        cellphone.testWork(new ICalculator() {
            @Override
            public double work(double n1, double n2) {

                return n1+n2;
            }
        },1.000,2);//分号结尾
    }
}
interface ICalculator{
    public double work(double n1,double n2);
    //该方法完成怎样的计算，就交给匿名内部类 处理
}

class Cellphone{
    //定义testWork（）方法，调用计算器接口的work（）方法
    //当我们调用testWork（）方法时，直接传入 一个实现了ICalculator接口的匿名内部类，即可
    public void testWork(ICalculator iCalculator,double n1,double n2){
        double result=iCalculator.work(n1,n2);
        //这里调用的work方法，实际上是 通过匿名内部类重写后的work方法
        //而正是因为 匿名内部类作为参数传入，所以才能接收到 重写后的work方法

        System.out.println("计算后的结果为"+result);
    }

}
