package ex_01_javabasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab007 {
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        System.out.println("enter 2nd number");
        int side2=sc.nextInt();
        System.out.println("enter 3rd number");
        int side3=sc.nextInt();

        HashMap<Integer,Integer> Hm=new HashMap<>();

        Hm.put(side1,Hm.getOrDefault(side1,0)+1);

        Hm.put(side2,Hm.getOrDefault(side2,0)+1);

        Hm.put(side3,Hm.getOrDefault(side3,0)+1);

        System.out.println(Hm);


        for(Map.Entry<Integer,Integer> entry:Hm.entrySet())
        {
            if(entry.getValue()>2)
            {System.out.println("equi triangle");}
            else if(entry.getValue()>1)
            {System.out.println("2 triangle");}
            else if(entry.getValue()==0)
            {System.out.println("0 triangle");}
        }





    }
}
