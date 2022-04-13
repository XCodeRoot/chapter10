package Day24.com.hspedu.Homework07;

public class Homework07 {

    public static void main(String[] args) {

        Car car = new Car(29);
        car.getAir().flow();
//        Car.Air air=car.new Air();
//        air.flow();
    }
}

class Car{

    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{

        public void flow(){

            if(temperature>40)
                System.out.println("吹冷风");
            else if(temperature<0)
                System.out.println("吹暖风");
            else
                System.out.println("关闭空调");
        }


    }
    public Air getAir(){
        return new Air();//返回Air（）对象
    }
}
