package Questions;

public class Question_05 {
    static void main(String[] args) {
        System.out.println("Hello "+m1());
    }

    static int m1(){
        try {
            return 100;
        } catch (Exception e) {
            return 3;
        }finally {
            return 10;// This will replace with 100
        }
    }
}
