

import java.sql.*;
import java.util.Scanner;

public class insertDb {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int ch;
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/default", "root", "Riddhi@24");
        Statement stmt = connection.createStatement();

        do {
            System.out.println("**************************");
            System.out.println(" 1. INSERT \n 2. UPDATE \n 3. DELETE \n 4. DISPLAY \n 5. Exit");
            System.out.println("Please Select Option");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter ID");
                    int id = sc.nextInt();
                    System.out.println("Enter Name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter Location");
                    String loc = sc.nextLine();
                    System.out.println("Enter Age");

                    int age = sc.nextInt();
                    PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?)");

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, loc);
                    ps.setInt(4, age  );
                    ps.execute();


                    break;


                case 2:
                    String query1 = "update student set Name='Johnson' " + "where id in(1)";
                    stmt.executeUpdate(query1);
                    System.out.println("Record has been updated ");

                    break;

                case 3:
                    String query2 = "delete from  student " + "where id=1";
                    stmt.executeUpdate(query2);
                    System.out.println("Record is deleted ");

                    break;

                case 4:
                    ResultSet rs = stmt.executeQuery("select* from student");

                    while (rs.next()) {
                        System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | "+rs.getString(3) + " | "+rs.getString(4));

                    }
                    break;

                default:
                    System.out.println("Please, select valid option");

            }



        } while (ch< 5) ;
    }
}













