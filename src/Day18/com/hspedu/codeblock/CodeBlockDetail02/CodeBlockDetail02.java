package Day18.com.hspedu.codeblock.CodeBlockDetail02;

public class CodeBlockDetail02 {
    public static void main(String[] args) {

        A a = new A();//

    }
}

class A{

    //无参构造器
    public A() {
        System.out.println("A类的无参构造器被调用");
    }

    //普通变量
    private int n2=getN2();


    {//普通代码块
        System.out.println("A的普通代码块1 被调用");
    }

    static {//静态代码块
        System.out.println("A的静态代码块1 被调用");
    }

    //静态变量
    private static int n1=getN1();

    //静态方法
    public static int getN1(){
        System.out.println("getN1()被调用");
        return 100;
    }

    //普通方法
    public int getN2(){
        System.out.println("getN2()被调用");
        return 200;
    }


}
