package ex_01_javabasics;
/// fibbonacii of the number
public class Lab003 {
 public static void main(String[] args){

 int a=0;
 int b=1;
 int num=10;
 int c=0;
 if(num>=a){System.out.println(a);}
 if(num>=b){System.out.println(b);}
 if(num>b){
 for(int i=2;i<=num;i++)
 {
     c=a+b;
     System.out.println(c);
     a=b;
     b=c;

 }}



    }
}
