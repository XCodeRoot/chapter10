package Day21.com.hspedu.innerclass.LocalInnerClass;

public class LocalInnerClass {
    public static void main(String[] args) {

        Outer02 outer02 = new Outer02();//new一个外部类的对象out02
        outer02.m1();//对象out02调用了m1（）方法
    }
}
class Outer02{

    private int n1=100;
    private void m2(){}//私有方法

    public void m1(){//方法
    //1. 局部内部类，是定义在外部类的局部位置，通常是在方法里,也可以在代码块里
    //3. 不能给局部内部类添加访问修饰符，但是可以使用final修饰，因为局部变量也可以用final修饰
    //4. 作用域仅在定义它的方法或代码块内
        class Inner02{  //局部内部类（看作局部变量，只是这个变量是个类，它本质还是类）
            private int n1=200;
        //2. 可以直接访问外部类的所有成员，包含私有的
            public void f1(){

                //外部类和局部外部类的成员重名了，调用的时候遵循就近原则
                //使用 外部类名.this.要调用的成员 可以直接调用外部类的成员
                //实际上，Outer02.this的本质就是外部类的对象，即哪个对象调用了m1（）方法，Outer02.this指的就是哪个对象
                System.out.println("n1 = "+ n1 +"\n外部类的n1= "+ Outer02.this.n1);
                //5. 局部内部类可以直接访问外部类的所有成员
                m2();
            }
        }
        class Inner03 extends Inner02{//内部类继承

        }

        //外部类 想 调用内部类的东西，可以在内部类所在的方法中 直接创建对象，然后调用东西
        Inner02 inner02 = new Inner02();
        inner02.f1();//调用局部内部类里的f1（）方法
    }

    {
        class Inner04{//代码块里的内部类

        }
    }



}
