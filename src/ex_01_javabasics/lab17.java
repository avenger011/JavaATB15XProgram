package ex_01_javabasics;

public class lab17
{
    public static void main (String[] args){

        String str="hello ganesh";
        String rev="";

        for(int i=str.length()-1;i>-1;i--)
        {
           rev=rev+str.charAt(i);

        }
        System.out.println(rev);
        System.out.println(str.substring(5));



    }
}
