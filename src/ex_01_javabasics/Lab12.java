package ex_01_javabasics;
import java.util.Scanner;
public class Lab12 {
    //to find factorial of 5
    //factprial of -numbers is 1
    //factorial of 0 =1
    public static void main(String[] args){
        int a=0;
        int b=1;

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;


        for(int i=num;i>=1;i--) {              //in factorial always use revcerse approach i.e --i coz it handels the -ve number case;
            fact=fact*i;
            System.out.println(i);
        }
        System.out.println(fact);
    }
}
