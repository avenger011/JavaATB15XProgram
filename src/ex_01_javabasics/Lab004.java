package ex_01_javabasics;

public class Lab004 {
    //factorial of a given number
    public static void main(String[] args)
    {
        int num=3;
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
     System.out.println(fact+" ");
    }
}
