package Day18.com.hspedu.static_;

public class StaticMethodDetail {


    public static void main(String[] args) {



    }
}

class D{

    private int n1=100;
    private static int n2=200;

    public void say(){//普通方法不仅可以访问普通成员还可以访问静态成员
        hi();
        hello();//都可以
        System.out.println(n1+n2+D.n2);

    }

    public static void hi(){

    }

    public static void hello(){//静态方法只能访问静态成员
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(D.n1);  错误，不能访问

        hi();//都可以
        D.hi();
    }

}
