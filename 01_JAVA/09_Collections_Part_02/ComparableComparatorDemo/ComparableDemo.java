package ComparableComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other){
        return Integer.compare(this.id,other.id);
    }
}

public class ComparableDemo {
    static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Datta"));
        employees.add(new Employee(101, "Rahul"));
        employees.add(new Employee(104, "Ganesh"));
        employees.add(new Employee(102, "Amit"));

        System.out.println("Before Sorting:");

        for (Employee e:employees){
            System.out.println(e.id+" "+e.name);
        }

        Collections.sort(employees);
        System.out.println("\nAfter Sorting:");

        for (Employee e:employees){
            System.out.println(e.id+" "+e.name);
        }
    }
}
