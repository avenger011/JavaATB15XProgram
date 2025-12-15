package ex_01_javabasics;
/// fibbonacii of the number
public class Lab003 {
 public static void main(String[] args){
int num=10;
int a=0;
int b=1;

if(num>=0)
{System.out.println(a);}
if(num>=1)
{System.out.println(b);

for(int i=1;i<num;i++)
    {System.out.println(a+b);
        a=b;
        b=i;

    }
}




    }
}
