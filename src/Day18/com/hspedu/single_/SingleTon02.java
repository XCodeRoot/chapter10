package Day18.com.hspedu.single_;

public class SingleTon02 {

    public static void main(String[] args) {
/**
 *  【懒汉式】单例设计模式
 */
        Cat instance1=Cat.getInstance();
        System.out.println(instance1);
        System.out.println("========同一个对象，同一个地址========");
        Cat instance2=Cat.getInstance();
        System.out.println(instance2);
    }
}
class Cat{
    private String name;
    private static Cat cat;//Cat类的变量cat

    /**
     *  【懒汉式】单例设计模式
     *  1.仍然先私有化构造器
     *  2.定义一个静态的该类 变量
     *  3.提供一个公共的静态方法
     *      只有当用户使用getInstance()方法时，才返回cat对象，后面再被调用，就返回上一次生成的cat对象
     */
    private Cat(String name){

        this.name=name;
    }

    public static Cat getInstance(){

        if(cat==null){//如果还没创建对象，给cat引用
            cat=new Cat("小可爱");//
        }
        return cat;//无论有没有创建对象，都要完成返回对象的功能
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}