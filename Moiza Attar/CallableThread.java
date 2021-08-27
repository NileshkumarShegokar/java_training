import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Callable1 implements Callable <String> {
    public String call( ) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 = "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return "Completed";
    }
}

public class CallableThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable1 c = new Callable1();
        FutureTask ft= new FutureTask(c);
        Thread th = new Thread(ft);
        th.start();
        System.out.println(ft.get());


    }
}
