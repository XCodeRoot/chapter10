package Day20.com.hspedu.interface_.Interface01;


/**
 * Phone 类 实现 USBInterface
 * 即，Phone需要去实现USBinterface接口 所规定的方法
 */
public class Phone implements UsbInterface{

    @Override
    public void start() {
        System.out.println("手机开始工作。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作。。。。。");
    }
}
