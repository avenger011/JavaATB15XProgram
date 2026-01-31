package ex_01_javabasics;

public class lab025_inheritence {

   abstract static class carp1
   {
       abstract void start();
       abstract void run();



        //the meaning of abstract class means that in that the class ma=ethod is not defined , it will be defined in child class
   }

   static class carp2 extends carp1{


       @Override
       void start() {
           System.out.println("start the car");
       }

       @Override
       void run() {
         System.out.println("car is running");

       }

       void stopcar(){
          System.out.println("stop the car");
       }
   }

   public static void main(String[] args)
   {
       carp2 c1=new carp2();
       c1.run();           // now we never know if run is part of childf class or parent calss so , hiding the workingf of the fuunctipn and desplaying only nessasary details
       c1.stopcar();
       c1.start();
   }
}
