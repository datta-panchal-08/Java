package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    public static final String URL = "";
    public static final String USER = "";
    public static final String PASSWORD = "";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

}
