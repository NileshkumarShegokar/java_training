/*

 program to get which thread is currently running


 */


class Demo extends Thread
{
   public void run()
   {
         try {
             System.out.println(
                     "Thread " + Thread.currentThread().getId()
                             + " is running");
         }
         catch(Exception e)
         {
             System.out.println("Exception cought");
         }

   }




}


public class Threddemo
{
    public static void main(String[] args) {

          int n=10;

          for(int i=1;i<10;i++)
           {
               Demo d=new Demo();
               d.start();
           }




    }
}
