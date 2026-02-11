package ex_01_javabasics.EXmethods;

public class part2 extends part1{
    public void drive(int speed){
        number=12;
        System.out.println("the car is going is this speed"+speed+ "with chavi "+super.number );

        }

        public static void main(String[] args)
        {
            part2 s1=new part2();
            s1.startcar("naya cxhavi");
            s1.putGear(2);
            s1.drive(60);


        }

    }


