import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "MySQL@12345"
            );

            Statement statement = con.createStatement();

            String query = "INSERT INTO students VALUES(11, 'Raj', 'raj@gmail.com', 22, 'MCA')";

            int update = statement.executeUpdate(query);

            System.out.println("INSERTED " + update + " ROWS");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}