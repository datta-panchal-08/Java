package service;

import config.DBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentService {

    public static void addStudents(String name,int age ,String course) throws SQLException {
        Connection con = DBConfig.getConnection();
        String query = "INSERT INTO students(name,age,course) VALUES(?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,age);
        preparedStatement.setString(3,course);

        int affectedRows = preparedStatement.executeUpdate();

        if(affectedRows > 0){
            System.out.println("Student added successfully..");
        }else {
            System.out.println("Failed to add student...");
        }
        preparedStatement.close();
        con.close();
    }

    public  static  void showStudents() throws SQLException {
        Connection con = DBConfig.getConnection();
        String query = "SELECT * FROM students";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s %-20s %-5s %-20s%n",
                "ID", "NAME", "AGE", "COURSE");

        System.out.println("----------------------------------------------------");

        while (resultSet.next()){
            System.out.printf("%-5d %-20s %-5d %-20s%n",
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("course"));
        }
        System.out.println("----------------------------------------------------");
        preparedStatement.close();
        con.close();
    }

    public static void getStudentById(int id) throws SQLException {
      try{
          Connection con = DBConfig.getConnection();
          String query = "SELECT * FROM students WHERE id = ?";
          PreparedStatement preparedStatement = con.prepareStatement(query);
          preparedStatement.setInt(1,id);
          ResultSet resultSet = preparedStatement.executeQuery();
          System.out.println("----------------------------------------------------");
          System.out.printf("%-5s %-20s %-5s %-20s%n",
                  "ID", "NAME", "AGE", "COURSE");

          System.out.println("----------------------------------------------------");
          if (resultSet.next()){
              System.out.printf("%-5d %-20s %-5d %-20s%n",
                      resultSet.getInt("id"),
                      resultSet.getString("name"),
                      resultSet.getInt("age"),
                      resultSet.getString("course"));
              System.out.println("----------------------------------------------------");
          }else {
              System.out.println("No student found with ID: " + id);
          }
          preparedStatement.close();
          con.close();
      } catch (SQLException e){
          e.printStackTrace();
      }
    }

    public static void updateStudentById(int id) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DBConfig.getConnection();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new course: ");
        String course = scanner.nextLine();

        String query = "UPDATE students SET name = ?, age = ?, course = ? WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(query);

        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setString(3, course);
        ps.setInt(4, id);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("No student found with ID: " + id);
        }

        ps.close();
        connection.close();
    }

    public static void deleteStudent(int id){
        try {
            Connection connection = DBConfig.getConnection();
            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("No student found with ID: " + id);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
