package HospitalManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Doctor {
    private Connection connection;

    public  Doctor(Connection connection){
        this.connection = connection;
    }

    public void viewDoctors() throws SQLException {
        String query = "SELECT * FROM doctors";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        System.out.println("Doctors:");
        System.out.println("+------+----------------------+----------------------+");
        System.out.printf("| %-4s | %-20s | %-20s |%n",
                "ID", "Name", "Specialization");
        System.out.println("+------+----------------------+----------------------+");

        while (resultSet.next()) {
            System.out.printf("| %-4d | %-20s | %-20s |%n",
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("specialization"));
        }

        System.out.println("+------+----------------------+----------------------+");

        resultSet.close();
        preparedStatement.close();
    }

    public boolean getDoctorById(int id) throws SQLException {
        String query = "SELECT * FROM doctors WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        }

        System.out.println("Doctor not found with ID: " + id);
        return false;
    }

}
