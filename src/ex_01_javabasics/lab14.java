package ex_01_javabasics;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;

public class lab14 {

    //converstion of set to list using function and itterate
    public static void main (String[] args) {
        HashSet<String> str = new HashSet<>();
        str.add("hoi");
        str.add("lucky");
        str.add("lucky1");
        str.add("lucky hoi");
        ArrayList<String> str2= ListToString(str);
        for(int i=0;i<str2.size();i++)
        {
            System.out.println(str2.get(i));

        }
    }
    static  ArrayList<String> ListToString(HashSet<String> str1){
        return new ArrayList<String>(str1);
    }
}
