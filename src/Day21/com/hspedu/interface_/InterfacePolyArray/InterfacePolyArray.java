package Day21.com.hspedu.interface_.InterfacePolyArray;

import javax.crypto.spec.PSource;

public class InterfacePolyArray {

    public static void main(String[] args) {

        //接口类型的数组
        USB[] usbs=new USB[2];
        //接口的引用，指向 实现了该接口的类的对象
        usbs[0]=new Phone_();
        usbs[1]=new Camera_();

        for(USB u: usbs){
            u.work();//动态绑定 实现了该接口的类的对象

            if(u instanceof Phone_){//这里判断 当前数组的这个元素，的运行类型是否是Phone_类

                //因为u是接口USB类，不能调用实现了该接口的类的特有方法，类似于向下转型，属于感情的自然流露
                ((Phone_) u).call();//输入u.call加回车，自动向下转型
            }
        }
    }
}
interface USB{
    void work();
}

class Phone_ implements USB{
    public void call(){
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}

class Camera_ implements USB{

    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}