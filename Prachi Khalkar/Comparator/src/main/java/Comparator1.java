import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Employee
{
    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString () {
        return "[id=" + this.id + ", name=" + this.name + "]";
    }


}

class NameComparator implements Comparator<Employee>{

    public int compare(Employee e1,Employee e2){
        return e1.name.compareTo(e2.name);
    }
    public static void main(String[] args) {
        List<Employee> c=new ArrayList<Employee>();
        c.add(new Employee(4,"abc"));
        c.add(new Employee(1,"xyz"));
        c.add(new Employee(6,"pqr"));
        c.add(new Employee(8,"stu"));

        System.out.println("Before Sorting");
        c.forEach(c1-> System.out.println(c1.toString()));
        System.out.println("sorting by name:");
        Collections.sort(c, new NameComparator ());
        System.out.println("after Sorting");
        c.forEach(c1-> System.out.println(c1.toString()));


    }



}

