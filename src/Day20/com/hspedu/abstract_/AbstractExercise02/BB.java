package Day20.com.hspedu.abstract_.AbstractExercise02;

public class BB extends Template{


    @Override
    public void job() {
        long num=0;

        for (long i=1;i<1000000000;i++){
            num*=i;
        }
    }
}
