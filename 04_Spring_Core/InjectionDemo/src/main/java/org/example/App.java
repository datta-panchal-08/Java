package org.example;

public class App {
    public static void main(String[] args) {

//        Student student = new Student(new DSA()); // Constructor Injection
         // Example Of Setter Injection
//        Course course = new JavaFullStack();
//        student.setCourse(course);
        Student student = new Student();
        student.course = new DSA();
        student.study();
    }
}
