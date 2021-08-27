/*
Use of yield(), stop() ,sleep(),suspend methods
 */

class Thread1 extends Thread
{
     public void run()
     {
         System.out.println("thread 1 is started");
            for(int i=1;i<=5;i++)
            {
                if(i==1) yield();
                    System.out.println("from Thraed1 i="+i);


            }
         System.out.println("... Exit Thread 1");

     }


}

class Thread2 extends Thread {
    public void run() {
        System.out.println("thread 2 is started");
        for (int j = 1; j <= 5; j++) {
            if (j == 2) stop();
                System.out.println("from Thraed2 j=" + j);
        }
        System.out.println("... Exit Thread 2");

    }

}
 class Thread3 extends Thread {
     public void run() {
         System.out.println("thread 3 is started");
         for (int k = 1; k <= 5; k++) {
             System.out.println("From Thread B: j = " + k);

             if (k == 3) {
                 try {
                     sleep(1000);
                 } catch (Exception e) {
                 }
             }


         }
         System.out.println("... Exit Thread 3");


     }

 }



public class Threaddemo2 {

    public static void main(String[] args) throws InterruptedException {

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();

           t1.start();
           t2.start();
           t3.start();







    }

}
