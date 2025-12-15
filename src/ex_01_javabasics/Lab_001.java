package ex_01_javabasics;
//count substring using index of,
public class Lab_001 {
    public static void main(String[] args){
        String st="#$sdddf#$errrt3#$434";

        int index=0;
        int count=0;

        while ((index=st.indexOf("#$",index))!=-1)
        {
            index=index+2;
            count=count+1;


        }
        System.out.println(count);
    }
}
