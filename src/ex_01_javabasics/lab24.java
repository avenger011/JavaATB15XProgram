package ex_01_javabasics;

public class lab24 {   //to over l;oad the constructor and use chgain cunstructor


      public static class student
      {
              int roll;
              String name;
              String branch;

           student(int n,String c)    //                ---------------------------------------------|
          {this.name=c;            //                                                                |
          this.roll=n;              //                                                               |
          }                     //                                                                   |
            student(String l)                           //                                           |
            {  this.branch=l;                         //                                             |
               this(45,"sai");  //we are calling the constructor of double paramenter i.e------
             }
           public static void main(String[] args)
           { student s1=new student("DSA");
            System.out.println(s1.name+" "+s1.branch+" "+s1.roll);

           }



}     }
