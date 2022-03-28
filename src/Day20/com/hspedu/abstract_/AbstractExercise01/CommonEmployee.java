package Day20.com.hspedu.abstract_.AbstractExercise01;

public class CommonEmployee extends Empolyee{

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"在工作");
    }
}
