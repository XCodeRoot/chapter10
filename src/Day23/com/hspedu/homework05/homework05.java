package Day23.com.hspedu.homework05;

public class homework05 {

    public static void main(String[] args) {
        new A().f1();

    }
}
class A{
    private String NAME="hspedu";

    public void f1(){

        class B{
            private final String NAME="韩顺平教育";
            public void show(){
                System.out.println("NAME="+NAME+"\n"+A.this.NAME);

            }
        }
        B b = new B();
        b.show();
    }
}
