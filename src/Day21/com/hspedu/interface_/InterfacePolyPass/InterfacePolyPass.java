package Day21.com.hspedu.interface_.InterfacePolyPass;

public class InterfacePolyPass {

    public static void main(String[] args) {
        //因为接口引用 可以指向实现了该接口的类的对象
        IG ig=new Teacher();
        //如果 IG接口 继承了 IH接口 ，Teacher只实现了IG接口，那么就相当于Teacher也实现了IH接口
        //这就是所谓的 接口多态传递现象
        IH ih=new Teacher();

    }
}

interface IG extends IH{}//IG接口 继承 IH接口

interface IH{}

class Teacher implements IG{//只实现IG接口

}


