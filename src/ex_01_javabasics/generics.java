package ex_01_javabasics;

import javax.swing.plaf.PanelUI;

public class generics {

    public static<breed> String naiNamKarna(breed a)
    {
        String naiHesru=a+" nai";
        return naiHesru;

    }

    public static void main(String[] args)
    {
        System.out.println(naiNamKarna("labrod"));
        System.out.println(naiNamKarna('o'));
        System.out.println(naiNamKarna(3));



    }








}
