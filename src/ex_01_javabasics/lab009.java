package ex_01_javabasics;

public class lab009 {
    //fifonaci series 0 1 1 2 3 5
    public static void main(String[] args)
    {
      int a=0;
      int b=1;
      int sum=0;
        System.out.println(a);
        System.out.println(b);

      for(int i=0;i<10;i++)
      {
          sum=a+b;
          a=b;
          b=sum;
          System.out.println(sum);

      }








    }
}
