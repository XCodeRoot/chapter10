package Day24.com.hspedu.homework06;

public class Homework06 {

    public static void main(String[] args) {

        Person tangseng = new Person("tangseng", new Horse());//只创建一次马
        tangseng.passRiver();//用船过河，因此要新建一个船
        tangseng.common();//用马
        tangseng.passRiver();//用船过河，因此要新建一个船
        tangseng.common();//用马
        tangseng.passRiver();//用船过河，因此要新建一个船
        tangseng.common();//用马




    }
}

interface Vehicles {//交通工具接口
    public void work();//work（）方法
}



class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("用马");
    }

}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("用船");
    }

}

class VehicleFactory {//交通工具工厂,两个方法分别返回Horse和Boat

    private static Horse horse=new Horse();//饿汉式，只用一匹马

    private VehicleFactory(){}//私有构造器


    public static Horse getHorse(){

        return horse;//
    }
    public static Boat getBoat(){

        return new Boat();
    }
}

