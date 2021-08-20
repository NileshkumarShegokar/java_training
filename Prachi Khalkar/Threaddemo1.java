/*

   Use of getId(), getState() and getpriority() methods

 */
public class Threaddemo1 extends Thread {

    public void run()
    {

              System.out.println("thread in demo class");

              try {
            System.out.println("thread is going to sleep");
            Thread.sleep(1000);
            System.out.println("thread is wake up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



    public static void main(String[] args) {
        Threaddemo1 t=new Threaddemo1();

        System.out.println("getState1  :"+t.getState());
        t.start();
        System.out.println("getstate2  :"+t.getState());
        System.out.println("getstate3  :"+t.getState());
        System.out.println("getstate4  :"+t.getState());
        System.out.println("thread Name :"+t.getName());
        System.out.println("thread Priority :"+t.getPriority());
        System.out.println("getstate5   :"+t.getState());


    }
}
