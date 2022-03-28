package Day20.com.hspedu.interface_.Interface01;

public class Computer {

    //编写一个方法
    public void work(UsbInterface usbInterface){//通过接口判断要执行手机还是相机
        usbInterface.start();
        usbInterface.stop();

    }
}
