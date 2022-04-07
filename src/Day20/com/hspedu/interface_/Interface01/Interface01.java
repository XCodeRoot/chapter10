package Day20.com.hspedu.interface_.Interface01;

import java.awt.*;

public class Interface01 {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Camera camera = new Camera();

        Computer computer = new Computer();//创建计算机

        computer.work(phone);//把手机接入计算机
        //接口的多态性
        computer.work(camera);//把相机接入计算机

    }
}
