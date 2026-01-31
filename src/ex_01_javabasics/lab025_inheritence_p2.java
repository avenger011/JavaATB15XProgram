package ex_01_javabasics;

public class lab025_inheritence_p2 {
    abstract static class parent{
        abstract void property();
        abstract void land();
    }

    abstract static class child extends parent
    {




        @Override
        void property() {
            System.out.println("property 1 acquired ");
        }

        @Override
        void land() {
            System.out.println("property land 2 acquired ");
        }
        abstract void crypto();

    }

   static class grandchildren extends child{


       @Override
       void crypto() {
           System.out.println("property 3 crypto accquired");
       }
       public static void main(String[] args){
           grandchildren g1=new grandchildren();
           g1.property();
           g1.land();
           g1.crypto();
       }
   }
}
