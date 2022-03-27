package Day18.com.hspedu.codeblock;

public class CodeBlock01 {

    public static void main(String[] args) {

        //类加载的情况,,,   执行静态代码块 和 类加载有关

//        // 1. 创建对象实例时，类会被加载
//        AA aa = new AA();
//
//        // 2. 创建子类对象实例时，父类也会被加载
//        //又因为父类先加载子类后加载，所以先执行父类的代码块
//        AA aa2=new AA();
//
//        // 3. 使用类的静态成员时，类会被加载
//        System.out.println(Cat.n1);//先加载父类，再加载子类


        DD dd = new DD();
        DD dd1 = new DD();
        //此时虽然new了两个DD类的对象，但是类只加载了一次，所以静态代码块只执行一次
        //因为创建了两个对象，所以普通代码块执行了两次

        System.out.println(DD.n1);//这里调用类的静态成员，所以加载了DD类，所以静态代码块被调用
        // 但是普通代码块并不会被调用
    }
}

class DD {
    public static int n1=8888;

    static {//静态代码块在类加载时执行
        System.out.println("DD的静态代码块1 被执行");
    }

    {//普通代码块在对象创建时执行
        System.out.println("DD的普通代码块1 被执行");
    }
}

class Animal {

    public static int n1 = 999;

    static {
        System.out.println("Animal的静态代码块1 被执行");
    }
}

class Cat extends Animal {

    public static int n1 = 999;

    static {
        System.out.println("Cat的静态代码块1 被执行");
    }
}

class BB {

    static {

        System.out.println("BB的静态代码块1 被执行");
    }
}

class AA extends BB {

    static {

        System.out.println("AA的静态代码块1 被执行");
    }

}
