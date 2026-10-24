package Questions;

public class Question_02 {
    static void main(String[] args) {
        try {
           int x = 100/0;
            System.out.println("Hello Try..");// this line will not execute if exception occurs
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Finally Completed..");
    }
}
