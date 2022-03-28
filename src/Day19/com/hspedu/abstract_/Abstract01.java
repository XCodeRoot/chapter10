package Day19.com.hspedu.abstract_;

public class Abstract01 {

    public static void main(String[] args) {



    }
}

abstract class Animal{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //其实这个方法 并没有什么意义，只能等待被重写的命运
    //===>即 父类方法的不确定性
    //===>所以，得把这个eat()设计成抽象方法
    //===>所谓抽象方法，就是没有实现的方法
    //===>而没有实现的方法，就是没有方法体的方法

//    public void eat(){
//        System.out.println("这是一个动物，但是不知道吃什么");
//    }

    //===>当一个类中存在抽象方法时，应把该类设为抽象类，由子类实现具体方法
    public abstract void eat();
}

