import service.StudentService;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);

       while(true){
           System.out.println("1. Add Student");
           System.out.println("2. Show Student");
           System.out.println("3. Get a Student");
           System.out.println("4. Update a Student");
           System.out.println("5. Delete a Student");
           System.out.println("6. Exit");

           System.out.print("Enter your choice : ");
           int choice = scanner.nextInt();

           switch (choice){
               case 1: {
                   scanner.nextLine();

                   System.out.print("Enter Student Name: ");
                   String name = scanner.nextLine();

                   System.out.print("Enter Student Age: ");
                   int age = scanner.nextInt();
                   scanner.nextLine();

                   System.out.print("Enter Student Course: ");
                   String course = scanner.nextLine();

                   studentService.addStudents(name, age, course);
                   break;
               }
               case 2:{
                   studentService.showStudents();
                   break;
               }
               case 3:{
                   System.out.print("Enter Student ID : ");
                   int studentId = scanner.nextInt();
                   studentService.getStudentById(studentId);
                   break;
               }
               case 4 :{
                   System.out.print("Enter Student ID : ");
                   int studentId = scanner.nextInt();
                   studentService.updateStudentById(studentId);
                   break;
               }case 5 :{
                   System.out.print("Enter Student ID : ");
                   int studentId = scanner.nextInt();
                   studentService.deleteStudent(studentId);
                   break;
               }
               case 6:{
                   System.exit(1);
               }
               default:{
                   System.out.println("Enter a valid choice");
               }
           }
       }


    }

}
