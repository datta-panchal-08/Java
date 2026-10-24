package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Motor m = context.getBean(Motor.class);
        m.doWork();

        context.close();
    }
}
