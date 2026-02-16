package ex_01_javabasics.superEx;

public class lab027 {   // thuis is the example of the generics

    public static <nai> String naihesruMethod(nai a)
    {
      String str=a+" kutta";
      return str;

    }





    public static void main(String[] args)
    {
        String s =naihesruMethod("kariya");
        System.out.println(s);

    }






}
