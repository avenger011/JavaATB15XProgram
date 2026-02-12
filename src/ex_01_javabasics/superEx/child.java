package ex_01_javabasics.superEx;

public class child extends parent{
    child(){
        System.out.println("heloow i am child");
        // super(50);

    }


    public static void main(String[] args){
      parent c1=new parent(50);

      System.out.println("___________________________________________");
      child c2=new child();
    }


}
