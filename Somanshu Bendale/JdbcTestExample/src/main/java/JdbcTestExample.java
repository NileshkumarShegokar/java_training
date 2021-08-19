import java.sql.*;
import java.util.Scanner;

public class JdbcTestExample{
    Scanner sc=new Scanner(System.in);
    public Connection createConnection() throws Exception
    {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/default","root","Som@nshu2799");


        return connection;

    }
    public void insertIntoTable() throws Exception
    {

            System.out.println("Enter id:");
            int sid=sc.nextInt();
            System.out.println("Enter name: ");
            sc.nextLine();
            String sname=sc.nextLine();
            System.out.println("Enter location:");
            String sloc=sc.nextLine();
            System.out.println("Enter age");
            int sage=sc.nextInt();
            Connection con=createConnection();
            PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?)");

            ps.setInt(1,sid);
            ps.setString(2,sname);
            ps.setString(3,sloc);
            ps.setInt(4,sage);
            boolean out=ps.execute();
            if(!out)
            {
                 System.out.println("Data Inserted successfully");
            }
            else
            {
                 System.out.println("Operation failed");
            }


    }
    public void deleteTable() throws Exception
    {

            System.out.println("Enter id:");
            int sid=sc.nextInt();


            Connection con=createConnection();
            PreparedStatement ps=con.prepareStatement("delete from student where id=?");

            ps.setInt(1,sid);
            boolean out=ps.execute();
            if(!out)
            {
                System.out.println("Data deleted successfully");
            }
            else
            {
                System.out.println("Operation failed");
            }

    }
    public void updateTable() throws  Exception
    {
        Connection con=createConnection();
        System.out.println("Enter id:");
        int sid=sc.nextInt();
        System.out.println("what u want to update: ");
        System.out.println("1. Name");
        System.out.println("2. Location");
        System.out.println("3. Age");
        System.out.println("Enter choice");
        int ch=sc.nextInt();
        sc.nextLine();
        boolean out;
        PreparedStatement ps;
        switch (ch)
        {
            case 1:
                System.out.println("Enter the name u want to update of id= "+sid+":");
                String sname=sc.nextLine();
                ps=con.prepareStatement("update student set name=? where id=?");
                ps.setString(1,sname);
                ps.setInt(2,sid);
                out=ps.execute();
                if(!out)
                {
                    System.out.println("Data Updated successfully");
                }
                else
                {
                    System.out.println("Operation failed");
                }
                break;
            case 2:
                System.out.println("Enter the Location u want to update of id= "+sid+":");
                String sloc=sc.nextLine();
                ps=con.prepareStatement("update student set location=? where id=?");
                ps.setString(1,sloc);
                ps.setInt(2,sid);
                out=ps.execute();
                if(!out)
                {
                    System.out.println("Data Updated successfully");
                }
                else
                {
                    System.out.println("Operation failed");
                }
                break;
            case 3:
                System.out.println("Enter the age u want to update of id= "+sid+":");
                String sage=sc.nextLine();
                ps=con.prepareStatement("update student set age=? where id=?");
                ps.setString(1,sage);
                ps.setInt(2,sid);
                out=ps.execute();
                if(!out)
                {
                    System.out.println("Data Updated successfully");
                }
                else
                {
                    System.out.println("Operation failed");
                }
                break;
            default:
                System.out.println("Enter valid input");

        }

    }
    public void displayTable() throws Exception
    {

        Connection con=createConnection();
            PreparedStatement ps=con.prepareStatement("select * from student");
            ResultSet rs=ps.executeQuery();
            System.out.println("\t\t Data From Student Table");
            System.out.println("*******************************************************");
            while (rs.next())
            {
               System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"     "+rs.getString(3)+"     "+rs.getInt(4));

            }
            System.out.println("*******************************************************");

    }
    public void menu() throws Exception
    {
        int ch;
        do {
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter choice:");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    insertIntoTable();

                    break;
                case 2:
                    deleteTable();
                    break;
                case 3 :

                    updateTable();
                    break;
                case 4:
                    displayTable();
                    break;
                default :
                    System.out.println("Enter valid input");
            }
        }while(ch<5);
    }
    public static void main(String[] args) throws Exception {

        JdbcTestExample j=new JdbcTestExample();
        j.menu();



    }
}
