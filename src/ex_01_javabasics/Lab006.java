package ex_01_javabasics;

import java.util.Scanner;
//check if the tiange its type using
public class Lab006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st side");
        int side1 = sc.nextInt();

        System.out.print("enter the 2st side");
        int side2 = sc.nextInt();

        System.out.print("enter the 3st side");
        int side3 = sc.nextInt();

        if(side1==side2&&side2==side3)
        {System.out.println("eqilateral trianagle");}
        else if(side1==side2||side1==side3||side3==side2)
        {System.out.println("iso triangle");}

        else{System.out.println("scalene triangle");}

    }
}
