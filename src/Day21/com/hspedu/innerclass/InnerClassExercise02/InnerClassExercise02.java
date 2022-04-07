package Day21.com.hspedu.innerclass.InnerClassExercise02;

import javafx.scene.control.Cell;

/**
 * 1.首先 需要写一个接口，里面写一个ring（）方法
 * 2.再写一个CellPhone类，类里写一个alarmClock（）方法，参数列表写接口类型Bell bell
 *   方法里 用 bell.ring（），这个ring（）实际上即将被匿名内部类重写
 * 3.在main里 new一个CellPhone的匿名对象，通过该对象调用alarmClock（）方法，传入的参数正是 匿名内部类
 * 4.该方法里的bell.ring（）实现动态绑定，回到匿名内部类 的 ring（）方法
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {

        new CellPhone().alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        new CellPhone().alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }

}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
