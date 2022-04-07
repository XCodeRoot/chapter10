package Day21.com.hspedu.innerclass.AnonymousInnerClass;

public class AnonymousInnerClass {
    /**
     * 演示匿名内部类的使用
     */
    public static void main(String[] args) {

        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}

class Outer04 {//外部类
    private int n1 = 10;//属性

    public void method() {//方法
        //基于接口的匿名内部类
        /** 需求：想使用接口，并创建对象
         *  1.传统方法：先创建类实现接口，再重写接口的方法
         *  2.如果Tiger或者Dog类只是使用一次，，可以使用 匿名内部类 简化开发
         *  3.tiger的编译类型？接口IA
         *  4.tiger的运行类型？就是匿名内部类
         *  5. 我们看底层
         *      class XXXX implements IA{//底层 会自动分配 类名 给匿名内部类，这个类名就是 外部类名加上$1
         *      @Override
         *             public void cry() {
         *                 System.out.println("1.老虎叫唤...");
         *             }
         *      }
         *      这里的XXXX，其实是匿名的，实际上XXXX 表示的是——> Outer04$1
         */

        IA tiger = new IA() {
            //6.jdk底层在创建 匿名内部类Outer04$1时，就立即创建了Outer04$1实例，并且马上把地址返回给 tiger
            //7.匿名内部类只能使用一次，但这个tiger对象可以继续使用
            @Override
            public void cry() {
                System.out.println("1.老虎叫唤...");
            }
        };//分号结尾
        tiger.cry();
        System.out.println("    tiger的运行类型是 " + tiger.getClass());

//-------------------------------------------------


        /**
         * 演示 ：基于类的匿名内部类
         * 1. father的编译类型？Father
         * 2. father的运行类型？Outer04$2  //按顺序编号
         *
         * 3.底层 自动创建匿名内部类， 实际上是一种类的继承关系
         *      class Outer04$2 extends Father{
         *      @Override
         *             public void test() {
         *                 System.out.println("2.匿名内部类 重写了 test（）方法");
         *             }
         *      }
         * 4.同时 也直接返回了 匿名内部类 Outer04$2的对象
         */
        Father father=new Father("jack"){//加上大括号就意味着 这是要创建匿名内部类
            @Override
            public void test() {
                System.out.println("2.匿名内部类 重写了 test（）方法");
            }
        };//分号结尾
        father.test();
        System.out.println("    father的运行类型  "+ father.getClass());


//---------------------------------------------------------


        //基于抽象类的匿名内部类，必须重写抽象类的所有方法
        Animal animal =new Animal(){
            @Override
            public void eat() {
                System.out.println("3.小狗吃骨头...");
            }
        };
        animal.eat();
    }

}

interface IA {//接口

    public void cry();//要被重写

}

class Father {

    public Father(String name) {//构造器
        System.out.println("接收到name: "+ name);
    }

    public void test() {//方法

    }
}

abstract class Animal{//抽象类
    public void eat(){}
}

