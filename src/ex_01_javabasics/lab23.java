package ex_01_javabasics;

public class lab23 {
    static class book{
     int cost;
     String title;
        book()
        {
            this.cost=0;
            this.title="this is not arg";
        }
       book(int n,String s)
       {
           this.cost=n;
           this.title=s;
       }
    }
    public static void main(String[] args)
    {
      book l1=new book(23,"this is by given parameter");
        System.out.println(l1.title);
    }
}
