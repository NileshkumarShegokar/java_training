import java.util.*;
public class Queuedemo{
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Prachi");
        queue.add("Pooja");
        queue.add("Pratiksha");
        queue.add("Piyush");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator i=queue.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> i2=queue.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
    }
}  
