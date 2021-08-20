/*
   use of getpriority() and setpriority()

 */

class ClassA extends Thread
{
    public void run()
    {

        System.out.println("running thread name is:"+Thread.currentThread().getName());
    }
}

class ClassB extends Thread
{
    public void run()
    {

        try {
            Thread.sleep(300);
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class Threaddemo4 {
    public static void main(String[] args) {

        ClassA t1=new ClassA();
        ClassA t2=new ClassA();
        ClassA t3=new ClassA();
        System.out.println("t1 thread priority : " + t1.getPriority());
        System.out.println("t2 thread priority : " + t2.getPriority());
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("t3 thread priority : " + t3.getPriority());
        t1.start();

         ClassB t4= new ClassB();
        System.out.println("before starting thread isAlive: "+t4.isAlive());
        t4.start();
        System.out.println("after starting thread isAlive: "+t4.isAlive());
    }
}






