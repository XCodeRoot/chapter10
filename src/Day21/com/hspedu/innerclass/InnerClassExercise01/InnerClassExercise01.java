package Day21.com.hspedu.innerclass.InnerClassExercise01;

import Day20.com.hspedu.abstract_.AbstractExercise02.AA;

public class InnerClassExercise01 {
    public static void main(String[] args) {

        //匿名内部类的编译类型是接口IL，所以把匿名内部类 当作 实参 直接传递
        //省去了创建实现接口的类（传统方法称为硬编码），也不用在该类里重写接口的方法
        //直接在匿名内部类里 重写方法即可（软编码）
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画...");
            }
        });
    }

    public static void f1(IL il){//形参是接口类型
        il.show();
    }
}

interface IL{//接口
    void show();

}
