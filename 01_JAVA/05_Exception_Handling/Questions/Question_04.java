package Questions;

public class Question_04 {
    static void main(String[] args) {
        try {
             try {
                int a = 10/0;
             }catch (NullPointerException e){
                 System.out.println("Inner Catch");
             }catch (ArithmeticException e){
                 System.out.println("Inner Catch-Arith");
             }
        } catch (Exception e) {
            System.out.println("Outer Exception..");
        }
    }
}
