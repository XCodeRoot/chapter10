package Day21.com.hspedu.interface_.ExtendsVsInterface;

public class ExtendsVsInterface {
    public static void main(String[] args) {

        LittleMonkey wukong = new LittleMonkey("wukong");
        wukong.climbing();
        wukong.swimming();
        wukong.flying();
    }
}

class Monkey{

    private String name;
    public void climbing(){
        System.out.println( name+ " 会爬树");
    }

    public Monkey(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}

/**
 *      继承：当子类继承了父类，就自动拥有了父类的功能
 *      接口：如果子类需要扩展功能，可以通过实现接口的方式来扩展
 *    实现接口，是java对单继承机制的一种补充
 */
class LittleMonkey extends Monkey implements Fishable,Birdable{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+" 通过学习，可以像鱼儿一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName()+" 通过学习，可以像鸟儿一样飞行");
    }
}
