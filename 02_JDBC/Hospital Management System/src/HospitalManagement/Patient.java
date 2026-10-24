package HospitalManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {
    private Connection connection;
    private Scanner scanner;

    public Patient(Connection connection,Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public void addPatient() throws SQLException {

        scanner.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Patient Gender: ");
        String gender = scanner.nextLine();

        String query = "INSERT INTO patients(name, age, gender) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setString(3, gender);

        int affectedRows = preparedStatement.executeUpdate();

        if (affectedRows > 0) {
            System.out.println("Patient Added Successfully!");
        } else {
            System.out.println("Failed to Add Patient!");
        }

        preparedStatement.close();
    }

    public void viewPatients() throws SQLException{
        String query = "SELECT * FROM patients";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Patients : ");
        System.out.println("+------+----------------------+-----+------------+");
        System.out.printf("| %-4s | %-20s | %-3s | %-10s |%n",
                "ID", "Name", "Age", "Gender");
        System.out.println("+------+----------------------+-----+------------+");

        while (resultSet.next()) {
            System.out.printf("| %-4d | %-20s | %-3d | %-10s |%n",
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("gender"));
        }

        System.out.println("+------+----------------------+-----+------------+");

        resultSet.close();
    }


    public boolean getPatientById(int id) throws SQLException {
        String query = "SELECT * FROM patients WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        }

        System.out.println("Patient not found with ID: " + id);
        return false;
    }

}
