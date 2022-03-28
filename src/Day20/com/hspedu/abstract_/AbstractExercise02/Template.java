package Day20.com.hspedu.abstract_.AbstractExercise02;

abstract public class Template {

    public abstract void job();//在抽象类里定义抽象方法，由子类完成实现功能

    public void calculate(){

        long start=System.currentTimeMillis();//计算前的时间，按毫秒算

        job();//这里是 动态绑定，运行类型是AA还是BB，决定调用的是哪个子类里的job（）方法

        long end=System.currentTimeMillis();//计算后的时间

        System.out.println("执行时间时"+(end-start));

    }
}
