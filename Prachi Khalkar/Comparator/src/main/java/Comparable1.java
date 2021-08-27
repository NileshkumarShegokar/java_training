import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable1 implements Comparable<Comparable1>{




        int id;
         String name;

    public Comparable1(int id, String name) {
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
    public int compareTo(Comparable1 co) {
        return this.id-co.id;
    }

    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + "]";
    }

    public static void main(String[] args) {
        List<Comparable1> c=new ArrayList<Comparable1>();
        c.add(new Comparable1(4,"Pratiksha"));
        c.add(new Comparable1(1,"Prachi"));
        c.add(new Comparable1(6,"Piyush"));
        c.add(new Comparable1(8,"Pooja"));

        c.forEach(c1-> System.out.println(c1.toString()));
        Collections.sort(c);
        System.out.println("after Sorting");
        c.forEach(c1-> System.out.println(c1.toString()));

    }

    }
