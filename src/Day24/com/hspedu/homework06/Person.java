package Day24.com.hspedu.homework06;

public class Person {

    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }


    public void passRiver(){

        if(!(vehicles instanceof Boat)) {

            vehicles=VehicleFactory.getBoat();
        }
        vehicles.work();
    }

    public void common(){
        if(!(vehicles instanceof Horse)) {

            vehicles=VehicleFactory.getHorse();
        }
        vehicles.work();
    }
}
