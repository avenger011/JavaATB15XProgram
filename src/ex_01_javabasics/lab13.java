package ex_01_javabasics;

import java.util.ArrayList;
import java.util.HashSet;
// converstion of set to array list
// remember setr cant be accessed using index cos set is unorered list
public class lab13 {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        str.add("hello");
        str.add("world");

        ArrayList<String> str3=converstionOfarray(str);
        System.out.println(str3.get(1));


    }
    static  ArrayList<String> converstionOfarray(HashSet<String> str1)
    {
        return new ArrayList<String>(str1);

    }
}

