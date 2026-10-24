
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {

        System.out.println("1. Application Started");

        System.out.println("2. Loading Spring Configuration...");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("3. Spring Container Created");
        System.out.println("4. Getting Car Bean...");

        Car car = context.getBean(Car.class);

        System.out.println("5. Car Bean Retrieved");
        System.out.println("6. Calling drive() Method...");

        car.drive();

        System.out.println("7. Program Finished");
    }
}
