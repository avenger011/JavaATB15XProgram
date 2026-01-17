package ex_01_javabasics;

public class lab20 {
    public static void main (String[] args){

        // to find the second larget number in array

        int[] arr={12,43,76,501,666,89,244};
        int l=0;
        int sl=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>l)
            {
            sl=l;
                l=arr[i];}
            if(arr[i]<l && arr[i]>sl)
            {sl=arr[i];}
        }
        System.out.println(sl);
    }
}
