package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    String course;

    public Student(int id,String name,String course) {
        this.course = course;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

}

public class CustomList {
    static void main(String[] args) {
      Student s1 = new Student(1,"Dattaray","Java");
      Student s2 = new Student(2,"Abhishek","DSA");
      Student s3 = new Student(3,"Nilesh","Devops");

      List<Student> studentList = new ArrayList<>();
      studentList.add(s1);
      studentList.add(s2);
      studentList.add(s3);

        System.out.println(studentList);

    }
}
