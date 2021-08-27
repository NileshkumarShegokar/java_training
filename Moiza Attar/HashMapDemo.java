import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[]) {

        Map <String , Integer> hmap = new HashMap <String , Integer>();

        hmap.put("Moiza" , 100);
        hmap.put("Yash" , 101);
        hmap.put("soma" , 102);

        //Size of the Map
        System.out.println("Size : " + hmap.size());
        System.out.println(hmap);

        hmap.put("Ravi", 103);
        hmap.putAll(hmap);

        System.out.println(hmap.get("Moiza"));

        System.out.println("********************Iterator********************");
        for(Map.Entry m:hmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("********************Remove********************");
        hmap.remove("Yash", 101);
        System.out.println("After Removing : " +hmap);

        System.out.println("********************Replace********************");
        hmap.replace("soma", 102, 105);
        for(Map.Entry m:hmap.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("*********************Lambda********************");
        hmap.forEach((key, value) -> {
            System.out.print("key:"+ key);
            System.out.println("  Value:"+ value);
        });
    }
}
