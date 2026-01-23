package ex_01_javabasics;

public class lab22 {
    public static class man{

        String name;
      man(String s)
        { this.name="name is "+s;

        }

    }
    public static void main(String[] args)
    {
        man l1=new man("saiganesh");
        man l2=new man("Ankush");
        System.out.println(l1.name);
        System.out.println(l2.name);
    }
}