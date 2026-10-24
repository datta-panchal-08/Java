
package org.example;

public class Car {

    private Engine engine;


    public Car() {
        System.out.println("Default Constructor Called");
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        int start = engine.start();

        if (start >= 1) {
            System.out.println("Let's Drive...");
        } else {
            System.out.println("Failed To Start Engine...");
        }
    }
}
