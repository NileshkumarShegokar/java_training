package Practice;

import java.sql.*;
import java.util.Scanner;


public class MavenProj {
    public Connection createConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/default", "root", "Mayur$4321");
        return conn;
    }

    public void insertRecord() throws SQLException, ClassNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc.nextInt();
        System.out.println("Enter Name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter Location");
        String loc = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        Connection conn=createConnection();
        PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, loc);
        ps.setInt(4, age);
        ps.execute();
    }

    public void displayRecord() throws SQLException, ClassNotFoundException
    {
        Connection conn=createConnection();
        System.out.println("********** DATA FROM STUDENT TABLE **********");
        ResultSet rs = conn.createStatement().executeQuery("select* from student");
        while (rs.next()) {
            System.out.println(rs.getInt(1 )+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
        }
    }

    public void deleteRecord() throws SQLException, ClassNotFoundException
    {
        System.out.println("Enter ID to be Deleted :");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Connection conn=createConnection();
        PreparedStatement ps = conn.prepareStatement("DELETE FROM student WHERE (ID = ?)");
        ps.setInt(1,id);
        ps.execute();
        System.out.println("Record Deleted Successfully !!!");
    }

    public void updateRecord() throws SQLException, ClassNotFoundException
    {

        int opt;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Which column you want to Update?");
            System.out.println(" 1. UPDATE NAME \n 2. UPDATE LOCATION  \n 3. UPDATE AGE \n 4. EXIT ");
            System.out.println("Please Select Option");
            opt = sc.nextInt();
            switch(opt)
            {
                case 1:updateName();
                    break;
                case 2:updateLocation();
                    break;
                case 3:updateAge();
                    break;
                case 4:break;
                default:
                    System.out.println("Please, Select Valid Option");
            }
        }while(opt<4);
    }

    public void updateName() throws SQLException, ClassNotFoundException
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ID to be Updated :");
        int id = sc.nextInt();
        System.out.println("Enter New Name :");
        sc.nextLine();
        String name = sc.nextLine();
        Connection conn=createConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE student SET Name = ? WHERE (ID = ?)");
        ps.setString(1,name);
        ps.setInt(2,id);
        ps.execute();

    }

    public void updateAge() throws SQLException, ClassNotFoundException
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ID to be Updated :");
        int id = sc.nextInt();
        System.out.println("Enter New Age :");
        sc.nextLine();
        String age = sc.nextLine();
        Connection conn=createConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE student SET Age = ? WHERE (ID = ?)");
        ps.setString(1,age);
        ps.setInt(2,id);
        ps.execute();

    }

    public void updateLocation() throws SQLException, ClassNotFoundException
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ID to be Updated :");
        int id = sc.nextInt();
        System.out.println("Enter New Location :");
        sc.nextLine();
        String loc = sc.nextLine();
        Connection conn=createConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE student SET Location = ? WHERE (ID = ?)");
        ps.setString(1,loc);
        ps.setInt(2,id);
        ps.execute();

    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        MavenProj mv = new MavenProj();
        int opt;
        do {
            System.out.println("**************************");
            System.out.println(" 1. INSERT \n 2. UPDATE \n 3. DELETE \n 4. DISPLAY \n 5. Exit");
            System.out.println("Please Select Option");
            opt = sc.nextInt();
            switch (opt) {
                case 1:mv.insertRecord();
                    break;
                case 2:mv.updateRecord();
                    break;
                case 3:mv.deleteRecord();
                    break;
                case 4: mv.displayRecord();
                    break;
                case 5:break;
                default:
                    System.out.println("Please, select valid option");
            }
        }while (opt < 5);
    }
}
