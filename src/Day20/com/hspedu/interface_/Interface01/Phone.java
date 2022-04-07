package Day20.com.hspedu.interface_.Interface01;


/**
 * Phone 类 实现 USBInterface
 * 即，Phone需要去实现USBinterface接口 所规定的方法
 */
public class Phone implements UsbInterface{
    //一个类 implements 实现接口
    //那么，需要将该接口的所以抽象方法都实现
    //将光标移到接口上，然后alt + enter快捷键，可以将这个接口的所有方法都实现，下面这个是快捷键自动给的代码
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
    @Override
    public void start() {
        System.out.println("手机开始工作。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作。。。。。");
    }
}
