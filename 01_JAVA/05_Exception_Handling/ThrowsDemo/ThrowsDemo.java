package ThrowsDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
    static void readFile() throws FileNotFoundException {

        FileReader file = new FileReader("datta.txt");

        System.out.println("File found");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
