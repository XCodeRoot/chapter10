package Day20.com.hspedu.abstract_.AbstractExercise01;

public class AbstractExercise01 {
    public static void main(String[] args) {

        Manager jack = new Manager("jack", 99, 10000);
        jack.setBonus(20000);
        jack.work();

        CommonEmployee tom = new CommonEmployee("tom", 22, 3000);
        tom.work();


    }
}
