package ComparableComparatorDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}


public class ComparatorDemo {
    static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101,"Dattatray",24));
        students.add(new Student(102,"Mohaneshwar",27));
        students.add(new Student(103,"Dnyaneshwar",29));
        students.add(new Student(104,"Ganesh",25));

        Comparator<Student> byAge = (s1,s2)-> Integer.compare(s1.age, s2.age);
        students.sort(byAge);

        for(Student s:students){
            System.out.println(
                    s.id+" "+s.name+" "+s.age
            );
        }

    }
}
