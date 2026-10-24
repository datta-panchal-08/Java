import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeleteDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "MySQL@12345"
            );

            Statement statement = con.createStatement();

            String query = "DELETE FROM students WHERE id = 1";

            int delete = statement.executeUpdate(query);

            System.out.println("DELETED " + delete + " ROWS");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}