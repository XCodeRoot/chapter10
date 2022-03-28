package Day20.com.hspedu.abstract_.AbstractExercise01;

abstract public class Empolyee {

    private String name;
    private int id;
    private double salary;

    public Empolyee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //抽象方法
    public abstract void work();
}
