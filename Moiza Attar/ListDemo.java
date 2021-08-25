import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
                List arrl=new ArrayList();

                //adding elemets in Arraylist
                arrl.add("Moiza");
                arrl.add("Yash");
                arrl.add("Mayur");
                arrl.add("Soma");
                arrl.add("Anni");
                arrl.add("Rony");
                arrl.add("Mayur"); //Duplicate value

                System.out.println("Size : " + arrl.size());
                System.out.println(arrl);

                arrl.add(3, "Prachi");
                System.out.println(arrl);

                System.out.println("\n");
                System.out.println("Change element of ArrayList : ");
                arrl.set(4, "Gay");
                System.out.println(arrl);

                System.out.println("\n");
                System.out.println("Remove element from ArrayList  : ");
                arrl.remove("Steve");
                System.out.println(arrl);

                arrl.remove(2);
                System.out.println(arrl);

                System.out.println("\n");
                System.out.println("Iterating element form ArrayList : ");
                 arrl.forEach(name ->{
                     System.out.println(name);
                 });

    }
}
