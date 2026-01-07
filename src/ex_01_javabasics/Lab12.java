package ex_01_javabasics;

public class Lab12 {
    //to find factorial of 5
    public static void main(String[] args){
        int a=0;
        int b=1;
        int num=5;
        int fact=1;

        for(int i=num;i>=1;i--) {
            fact=fact*i;
            System.out.println(i);
        }
        System.out.println(fact);
    }
}
