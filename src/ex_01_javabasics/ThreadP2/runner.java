package ex_01_javabasics.ThreadP2;

public class runner {
    public static void main(String[] args){
        Thread t1=new Thread(new parent(23));
        Thread t2=new Thread(new parent(22));

        t1.start();
        t2.start();

    }
}
