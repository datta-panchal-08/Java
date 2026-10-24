import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ForwardDirOnly {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "MySQL@12345"
            );

            Statement statement = con.createStatement();

            String query = "SELECT * FROM students";

            ResultSet rs = statement.executeQuery(query);

            System.out.println("-------- Read Data ----------");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getString("course")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
