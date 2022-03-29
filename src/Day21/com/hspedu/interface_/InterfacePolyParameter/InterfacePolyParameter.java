package Day21.com.hspedu.interface_.InterfacePolyParameter;

public class InterfacePolyParameter {

    public static void main(String[] args) {

        //接口的多态体现
        //接口类型的变量 if01 可以指向 实现了接口 IF 的对象实例（类似于向上转型
        IF if01=new Monster();
        if01=new Car();

    }
}

interface IF{

}

class Monster implements IF{//实现接口

}
class Car implements IF{

}