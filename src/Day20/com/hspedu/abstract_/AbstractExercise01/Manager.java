package Day20.com.hspedu.abstract_.AbstractExercise01;

public class Manager extends Empolyee{

    private double bonus;
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){

        System.out.println("经理 "+getName()+" 在工作");
    }
}
