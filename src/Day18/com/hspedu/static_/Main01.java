package Day18.com.hspedu.static_;

public class Main01 {

    private static String name="jack";
    private int n1=100;

    public static void hi(){
        System.out.println("Main01 的hi（）方法");
    }

    public void hello(){

    }


    public static void main(String[] args){

        System.out.println(name);//静态调用静态可以
        hi();//静态调用静态可以
        Main01.hi();
/**
*        System.out.println(n1);//错误
*        hello();//错误
*/

        //先创建该类的实例对象，用对象.成员就可以在 静态方法main中调用非静态成员
        //但匿名对象不行
        Main01 main01 = new Main01();

        System.out.println(main01.n1);//都可以
        main01.hi();
    }

}
