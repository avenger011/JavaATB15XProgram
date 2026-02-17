package ex_01_javabasics.ThreadP2;

public class parent implements Runnable{
    parent(int a){

    }
    @Override
    public  void run(){
        System.out.println(Thread.currentThread().getName()+" a :"+Thread.currentThread().isAlive());

    }
}
