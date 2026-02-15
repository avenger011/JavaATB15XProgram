package ex_01_javabasics.multiJAVA;

public class runner {
    public static void main(String[] args)
    {
        Thread t1=new Thread(new MultiJava(2001));
        Thread t2=new Thread(new MultiJava(2000));

        t1.start();
        t2.start();

    }
}
