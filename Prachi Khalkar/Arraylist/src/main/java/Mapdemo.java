/*import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//import java.util.function.BiConsumer;
//import java.util.*;

class Employee
{
    String nm;
    public Employee(String nm)
    {
        this.nm=nm;
    }
}
public class Mapdemo {
    public static void main(String[] args) {
      Employee e1=new Employee("abc");
      Employee e2=new Employee("xyz");
      Employee e3=new Employee("pqr");
        Employee e4=new Employee("asd");
        Employee e5=new Employee("wel");

        Map<String,Employee> m=new HashMap();
        m.put("emp1",e1);
        m.put("emp2",e2);
        m.put("emp3",e3);

        System.out.println("size of map is:"+m.size());
        System.out.println(m.get("emp2").nm);

        System.out.println("***************get key and values of*************");
        for(Map.Entry<String,Employee>emp:m.entrySet())
        {
            System.out.println(emp.getKey());
            System.out.println(emp.getValue());
        }

        System.out.println("***************using lambda Expression*************");
        m.forEach((key, value) -> {
            System.out.print("key: "+ key);
            System.out.println(", Value: "+ value);
        });

        System.out.println("***************getting keys as key set to iterate*************");
          Set <String> s=m.keySet();
            s.forEach((key)->
            {
                System.out.println(key);
                System.out.println(m.get(key).nm);
            });




    }
}
*/