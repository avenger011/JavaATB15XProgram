package ex_01_javabasics.multiJAVA;

public class MultiJava implements Runnable
{
   int year;

    public  MultiJava(int year)
        {this.year=year;}
    @Override
    public void run()
    {
        for(int i=1;i<year;i++)
          {if(i%5==0)
          try {

                  System.out.println(i);
                  System.out.println(Thread.currentThread().getName());
                  Thread.sleep(2000);
              }
          catch (Exception e)
          {System.out.println(e);}

          }

      }

}


