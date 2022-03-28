package Day20.com.hspedu.interface_.Interface01;

public class Camera implements UsbInterface{

    @Override
    public void start() {
        System.out.println("相机开始工作。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作。。。。。");
    }
}
