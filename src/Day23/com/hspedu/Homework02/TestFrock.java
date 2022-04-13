package Day23.com.hspedu.Homework02;

public class TestFrock {//Frock,女装

    public static void main(String[] args) {

        Frock frock = new Frock();
        System.out.println(frock.getSerialNumber());

        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());

        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
    }

}

class Frock{

    private static int currentNum=100000;//衣服出厂的序列号初始值
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }


}
