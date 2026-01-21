package ex_01_javabasics;

public class lab21 {
    public static void main(String[] args){
        int n=6;
      for(int i=0;i<n;i++)
      {

          for(int j=0;j<2*i-1;j++)System.out.print(" ");
          for(int k=n;k>2*i-1;k--)System.out.print("*");

          System.out.println();
      }
    }
}
