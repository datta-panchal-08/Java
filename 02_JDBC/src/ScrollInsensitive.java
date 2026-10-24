import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "MySQL@12345"
            );

            Statement statement = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            String query = "SELECT * FROM students";

            ResultSet rs = statement.executeQuery(query);
            // TYPE_FORWARD_ONLY , CONCURRENT_READ_ONLY -- default

            System.out.println("-------- Read Data ----------");

            rs.last();
            System.out.println("Last Row : "+  rs.getInt("age"));
            System.out.println("Last Row : "+  rs.getString("course"));

            rs.first();
            System.out.println("First Row : "+  rs.getString("name"));
            System.out.println("First Row : "+  rs.getString("email"));

            System.out.println("Row Second : "+rs.absolute(2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
