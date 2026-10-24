import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UsingScannerForPrepared {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "MySQL@12345"
            );

            String query = "INSERT INTO students VALUES(?,?,?, ?, ?)";
            PreparedStatement psmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter id for student ");
            int id = sc.nextInt();
            System.out.println("Enter name of the student ");
            String name = sc.next();
            System.out.println("Enter email of the student ");
            String email = sc.next();
            System.out.println("Enter age of student ");
            int age = sc.nextInt();
            System.out.println("Enter course of the student ");
            String course = sc.next();

            psmt.setInt(1,id);
            psmt.setString(2,name);
            psmt.setString(3,email);
            psmt.setInt(4,age);
            psmt.setString(5,course);

            int update = psmt.executeUpdate();

            System.out.println("INSERTED " + update);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}