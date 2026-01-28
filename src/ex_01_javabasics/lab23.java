package ex_01_javabasics;

public class lab23 {
    static class book{
     int cost;
     String title;
        book(String t)
        {

            this.title=t;
        }
       book(int n,String s)
       {
           this.cost=n;
           this(s);
       }
    }
    public static void main(String[] args)
    {
      book l1=new book(23,"this is by given parameter");
        System.out.println(l1.title);
        System.out.println(l1.cost);
    }
}
