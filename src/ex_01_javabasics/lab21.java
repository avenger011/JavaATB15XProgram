package ex_01_javabasics;

public class lab21 {
    public static void main(String[] args){
        int n=5;
        String[][] a=null;

        for(int i=0;i<n;i++ )
        {
            for (int j=0;j<n;j++)
            {
              if(j<i)
              {a[i][j]="*";}
              else{
                  a[i][j]=" ";
              }
            }
        }
    }
}
