package ex_01_javabasics;

import java.util.ArrayList;
import java.util.List;
public class Lab005 {
    public static void main(String[] args){
String str="Sai Ganesh Durga rao";
String[] str2=str.split(" ");

for(int i=0;i<str2.length-1;i++)
    {
     char[] str3=str2[i].toCharArray();
     System.out.print(" "+str3[0]);

    }
System.out.println(" "+str2[2]);

}
}
