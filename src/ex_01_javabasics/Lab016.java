package ex_01_javabasics;

public class Lab016 {

    public static void main(String[] args) {
        int[] str={5,4,3,6,1};
        int temp=0;
        for(int i=0;i<str.length-1;i++)
        {
            if(str[i]<str[i+1])
            {
                temp=str[i];
                str[i]=str[i+1];
                str[i+1]=temp;
            }

        }
        for(int i=0;i<str.length;i++)
        { System.out.println(str.length);}
    }


    }
