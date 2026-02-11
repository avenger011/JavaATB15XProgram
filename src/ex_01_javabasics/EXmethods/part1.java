package ex_01_javabasics.EXmethods;

public class part1 {
    int number=100;
    public String startcar(String chavi)
    {System.out.println("the car is started using the key "+chavi);
        chavi=chavi+100;
    return chavi;}


    public void putGear(int Gnumber){
        System.out.println("the car is running with gear number "+Gnumber);
        System.out.println("driver ki "+this.number+" baar phati hai" );
    }
}
