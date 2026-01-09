package ex_01_javabasics;

import java.util.Scanner;

public class Lab015 {
    //to convert the reverse number

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int res=Covertfunk(num);
         System.out.println(res);

    }
    static int Covertfunk(int num2){
      int a=0;
      int b=0;
      while(num2!=0)
      {
          a=num2%10;
          b=b*10+a;
          num2=num2/10;
      }
      return b;
    }
}
