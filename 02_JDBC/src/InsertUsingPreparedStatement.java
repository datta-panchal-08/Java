import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertUsingPreparedStatement {

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

            psmt.setInt(1,1);
            psmt.setString(2,"Datta");
            psmt.setString(3,"dattapanchal464@gmail.com");
            psmt.setInt(4,24);
            psmt.setString(5,"MCA");

            int update = psmt.executeUpdate();

            System.out.println("INSERTED " + update);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}