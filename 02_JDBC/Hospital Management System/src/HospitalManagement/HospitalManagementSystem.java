package HospitalManagement;

import java.sql.*;
import java.util.Scanner;

public class HospitalManagementSystem {
    private static final String url = "";
    private static final String username = "";
    private static final String password = "";

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url,username,password);
            Patient patient = new Patient(connection,scanner);
            Doctor doctor = new Doctor(connection);
            while (true){
                System.out.println(" HOSPITAL MANAGEMENT SYSTEM ");
                System.out.println("1. Add Patients");
                System.out.println("2. View Patients");
                System.out.println("3. View Doctors");
                System.out.println("4. Book Appointment");
                System.out.println("5. Exit");

                System.out.println("Enter Your Choice : ");
                int choice = scanner.nextInt();

                switch (choice){

                    case 1 :{
                           patient.addPatient();
                           System.out.println();
                           break;
                     }
                    case 2 : {
                        patient.viewPatients();
                        System.out.println();
                          break;
                    }case 3 : {
                        doctor.viewDoctors();
                        System.out.println();
                        break;
                    }case 4 : {
                        bookAppointment(patient,doctor,connection,scanner);
                        System.out.println();
                        break;
                    }case 5 : {
                       return;
                    }
                    default:{
                        System.out.println("Enter Valid Choice : ");
                        break;
                    }
                }
            }


    }

    public static void bookAppointment(Patient patient,Doctor doctor,Connection connection,Scanner scanner) throws SQLException {
        System.out.println("Enter Patient ID: ");
        int patientId = scanner.nextInt();
        System.out.println("Enter Doctor ID: ");
        int doctorId = scanner.nextInt();
        System.out.println("Enter Appointment Date (YYYY-MM-DD)");
        String appointmentDate = scanner.next();
        if (patient.getPatientById(patientId) && doctor.getDoctorById(doctorId)){
            if(checkDoctorAvailability(doctorId,appointmentDate,connection)){
                String appointmentQuery = "INSERT INTO appointments(patient_id,doctor_id,appointment_date) VALUES(?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(appointmentQuery);
                preparedStatement.setInt(1,patientId);
                preparedStatement.setInt(2,doctorId);
                preparedStatement.setString(3,appointmentDate);
                int affectedRows = preparedStatement.executeUpdate();
                if(affectedRows > 0){
                    System.out.println("Appointment Fixed...");
                }else {
                    System.out.println("Failed to fix appointment...");
                }
            }else {
                System.out.println("Doctor not available on this date!!");
            }
        }else{
            System.out.println("Either patient or doctor doesn't exists!!");
        }
    }

    public static boolean checkDoctorAvailability(int doctorId,String appointmentDate,Connection connection) throws SQLException {
        String query = "SELECT COUNT(*) FROM appointments where doctor_id = ? AND appointment_date = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,doctorId);
        preparedStatement.setString(2,appointmentDate);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            int count = resultSet.getInt(1);
            if (count == 0){
                return  true;
            }
        }
        return  false;
    }

}
