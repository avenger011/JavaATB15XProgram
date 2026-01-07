package ex_01_javabasics;

import java.util.Scanner;

public class guessGame {
    public static void main(String[] args){
        //guess number between 1-100 , guess again

        int number=23;
        int Ccount=0;

        System.out.println("enter the guessed dumber");
        Scanner sc=new Scanner(System.in);
        int guess=sc.nextInt();


        while(number!=guess) {
            if (guess > number) {
                System.out.println("no the number is less than " + guess + " and grater than 1");
                Ccount = Ccount + 1;
                System.out.println("try again the number");
                guess=sc.nextInt();
            } else if (guess < number) {
                System.out.println("no the number is greater than " + guess + "and less than 100");
                Ccount = Ccount + 1;
                System.out.println("try again the number");
                guess=sc.nextInt();
            }

        }
        System.out.println("success");
        System.out.println("the attempt taken is "+Ccount+1);

    }
}
