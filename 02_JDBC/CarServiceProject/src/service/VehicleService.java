package service;

import config.DBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleService {

    public static void addVehicle(int customer_id,String numberPlate,String model) throws SQLException {
        Connection con = DBConfig.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO vehicles(customer_id,number_plate,model) VALUES (?,?,?)");
        ps.setInt(1,customer_id);
        ps.setString(2,numberPlate);
        ps.setString(3,model);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

}
