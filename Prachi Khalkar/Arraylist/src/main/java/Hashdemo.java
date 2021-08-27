import java.util.*;

public class Hashdemo {
    public static void main(String[] args) {


        Hashtable<Integer, String> h = new Hashtable<Integer, String>();


        h.put(10, "Gayatri");
        h.put(15, "4");
        h.put(20, "Gayatri");
        h.put(25, "technology");
        h.put(30, "Java");


        System.out.println("Initial Mappings are: " + h);


        String returned_value = (String)h.remove(20);


        System.out.println("Returned value is: "+ returned_value);


        System.out.println("New map is: "+ h);
    }
}
