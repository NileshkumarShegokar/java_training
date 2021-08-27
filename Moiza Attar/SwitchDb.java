import java.sql.*;
import java.util.Scanner;

public class SwitchDb {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        int ch;
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "9822761213");
        Statement state = connection.createStatement();

        do {
            System.out.print("************DATABASE OPERATION*********");
            System.out.println("\n1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the id : ");
                    int id = sc.nextInt();
                    System.out.print("Enter the Name : ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter the Location: ");
                    String loc = sc.nextLine();
                    System.out.print("Enter the Age : ");
                    int age = sc.nextInt();
                    System.out.print("Enter the Number : ");
                    int num = sc.nextInt();

                    PreparedStatement pr = connection.prepareStatement("insert into emp values(?,?,?,?,?)");

                    pr.setInt(1, id);
                    pr.setString(2, name);
                    pr.setString(3, loc);
                    pr.setInt(4, age);
                    pr.setInt(5, num);
                    pr.execute();
                    break;

                case 2:
                    ResultSet rs = state.executeQuery("select* from emp");
                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4) + "  " + rs.getInt(5));
                    }
                    break;

                case 3:
                    System.out.println("Enter id : ");
                    id = sc.nextInt();
                    PreparedStatement statement = connection.prepareStatement("DELETE FROM emp WHERE id=?");
                    statement.setInt(1, id);
                    statement.execute();
                    break;

                case 4:
                    System.out.println("Enter id : ");
                    id = sc.nextInt();

                    System.out.println("Update values" );

                    System.out.print("Enter the Name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("Enter the Location: ");
                    loc = sc.nextLine();
                    System.out.print("Enter the Age : ");
                    age = sc.nextInt();
                    System.out.print("Enter the Number : ");
                    num = sc.nextInt();

                    PreparedStatement stat = connection.prepareStatement("UPDATE emp SET name = ?, location = ?, age = ?, num= ? WHERE id = ?");
                   // stat.setInt(1, 34);
                    stat.setString(1, name);
                    stat.setString(2, loc);
                    stat.setInt(3, age);
                    stat.setInt(4, num);
                    stat.setInt(5, id);
                    stat.executeUpdate();
                    break;

                default :
                    System.out.println("Invalid choice");
                    System.out.print("\n");
            }
        } while (ch < 5);
    }
}
