import java.sql.*;
import java.util.Scanner;

 class Database {
    int id, age;
    String name, address;

    Scanner sc = new Scanner(System.in);
    PreparedStatement p;
    Connection con;

    public void connection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/default", "root", "pkha14@21");
    }

    public void insertrecord() throws Exception {
        System.out.println("enter student ID:");
        id = sc.nextInt();
        System.out.println("enter student Name:");
        name = sc.next();
        System.out.println("enter student Address:");
        address = sc.next();
        System.out.println("enter student Age:");
        age = sc.nextInt();

        PreparedStatement p = con.prepareStatement("insert into stud values(?,?,?,?)");
        p.setInt(1, id);
        p.setString(2, name);
        p.setString(3, address);
        p.setInt(4, age);
        //p.execute();


        boolean x = false;
        if (x == p.execute())
            System.out.println("Record Successfully Inserted");
        else
            System.out.println("Insert Failed");

    }

    public void updaterecord() throws SQLException {
        System.out.println("whose record you want to update:");
        id = sc.nextInt();
        System.out.println("which record you want to update:");
        name = sc.next();
        age = sc.nextInt();

        p = con.prepareStatement("update stud set Name=?,Age=? where Id=?");
        p.setString(1, name);
        p.setInt(2, age);
        p.setInt(3, id);
        p.executeUpdate();

        System.out.println("data updated successfully");
    }

    public void deleterecord() throws SQLException {
        System.out.println("Insert id to delete record: ");
        id = sc.nextInt();
        p = con.prepareStatement("delete from stud where Id=?");
        p.setInt(1, id);
        //p.execute();
        boolean y = false;
        if (y == p.execute())
            System.out.println("Successfully deleted");
    }

    public void displayrecord() throws SQLException {


        p = con.prepareStatement("select * from stud");
        ResultSet rs2 = p.executeQuery();

        System.out.println("ID        Name          Address          Age");
        while (rs2.next()) {
            int i = rs2.getInt("Id");
            String nm = rs2.getString("Name");
            String add = rs2.getString("Address");
            String ag = rs2.getString("Age");
            System.out.println(i + "\t\t" + nm
                    + "\t\t"+"   " + add + "\t\t " + ag);

        }


    }


}

class Databaseop extends Database
{

    public static void main(String[] args)
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        Database d=new Database();
        try
        {
            do
            {
                d.connection();
                System.out.println("************Database Operations**********");
                System.out.println("1.insert Record into database");
                System.out.println("2.update Record of Database");
                System.out.println("3.Display Record from database");
                System.out.println("4.Delete Record from database");
                System.out.println("5.Exit");
                System.out.println("Enter Your Choice");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        d.insertrecord();
                        break;
                    case 2:
                        d.updaterecord();
                        break;
                    case 3:
                        d.displayrecord();
                        break;
                    case 4:
                        d.deleterecord();
                        break;
                    case 5:
                        System.exit(0);
                        break;

                }
            }while(ch!=5);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}