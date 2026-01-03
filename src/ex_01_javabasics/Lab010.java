package ex_01_javabasics;


import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class Lab010 {
    public static void main(String[] args) {
        String str = "asdfasg3herty";
        char[] str2 = str.toCharArray();
        Map<Character, Integer> str3 = new HashMap<>();
        for(char a:str2) {
            str3.put(a,str3.getOrDefault(a,0)+1);

        }
        System.out.println(str3);
        for(Map.Entry<Character, Integer> entry:str3.entrySet()){
            System.out.print(entry.getKey());
        }
    }
}
