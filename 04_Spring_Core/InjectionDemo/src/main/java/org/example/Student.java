package org.example;

public class Student {

//    private Course course;
    // Doing Public To Perform Filed Injection
    public Course course;

    // Dependency Injection

     // Constructor Injection
    // Default Constructor
    public Student(){

    }

    public Student(Course course) {
        this.course = course;
    }

    // setter injection
    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(){
        int start = course.enroll();

        if(start>=1){
            System.out.println("New Journey Started...");
        }else{
            System.out.println("Failed To Enroll...");
        }

    }

}
