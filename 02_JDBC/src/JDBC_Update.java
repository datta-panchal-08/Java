import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "MySQL@12345"
            );

            Statement statement = con.createStatement();

            String query = "UPDATE students SET age = 22 WHERE id = 1";

            int update = statement.executeUpdate(query);

            System.out.println("UPDATED " + update + " ROWS");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}