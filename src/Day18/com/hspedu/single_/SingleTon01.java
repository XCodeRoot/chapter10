package Day18.com.hspedu.single_;

public class SingleTon01 {

    public static void main(String[] args) {

//        Girlfriend girlfriend1 = new Girlfriend("小红");//new 一个对象
//        Girlfriend girlfriend2 = new Girlfriend("小花");//再new 一个对象

        Girlfriend instance1=Girlfriend.getInstance();//这里就体现出了
        // 要把Girlfriend类的 对象 和 返回对象的方法 设成静态的原因
        //在不创建实例对象的情况下就能调用这个类里的方法
        System.out.println(instance1);

        System.out.println("=======这两个是同一个对象（地址相同）==============================");
        Girlfriend instance2=Girlfriend.getInstance();//因为只在类加载的时候 初始化静态对象，
        System.out.println(instance2);
    }

}

class Girlfriend{//定义 女朋友 类

    private String name;

    //因为要被公共的静态方法获取，所以 这个对象要是静态的
    private static Girlfriend girlfriend1 = new Girlfriend("小花");

    /**【饿汉式 单例设计模式】，饿汉式可能造成创建了但是没使用对象的尴尬
     *
     * 如何保证我们只能创建一个Girlfriend对象
     *  1.将构造器私有化
     *  2.在类 的内部 new对象 ， 但主方法里还是不能使用这个私有的静态对象
     *  3.提供一个公共的static方法，用来返回这个对象
     *      当加载了Girlfriend类时，就创建对象
     */
    //构造器私有化 之后 ，无法在主方法里new对象
    private Girlfriend(String name) {
        this.name = name;
    }

    public static Girlfriend getInstance(){//公共的静态的返回对象的方法，便于主方法调用
        return girlfriend1;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';


    }
}

