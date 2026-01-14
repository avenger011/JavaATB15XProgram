package ex_01_javabasics;

public class lab18 {
    public static void main(String[] args){
        //to print * piramid
        String st="";
        String str="******";

        for(int i=0;i<6;i++)
        {
            st=st+" ";
            System.out.println(st+str.substring(i));
        }
    }
}
