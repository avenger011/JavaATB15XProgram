package ex_01_javabasics;

import java.util.Scanner;

public class lab19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(s1);
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
}
