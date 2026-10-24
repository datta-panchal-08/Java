import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitiveDemo {
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

            System.out.println("-------- Fetching Data That is not in live update mode ----------");

            Thread.sleep(10000);

            rs.beforeFirst();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getString("course")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
