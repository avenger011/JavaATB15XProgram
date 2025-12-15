package ex_01_javabasics;
//print the upper case in string
public class Lab002 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String arr="AsddfdeRddfFf";
        System.out.println(arr);
        char[] arr2=arr.toCharArray();
        for(char ch:arr2)
        {
            if(Character.isUpperCase(ch))
            {System.out.println(ch+" ");}

        }
}
    }