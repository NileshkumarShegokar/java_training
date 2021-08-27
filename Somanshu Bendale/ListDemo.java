import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //List list=new ArrayList();
        List list=new LinkedList();
        list.add("Ani");
        list.add("Mayu");
        list.add("yash");
        list.add("moiz");

        System.out.println("Size: "+list.size());
        list.forEach(name -> {
            System.out.println(name);
        });
        System.out.println("last : " +list.lastIndexOf("yash"));



    }
}
