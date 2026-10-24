public class ArithmeticExceptionDemo {
    static void main(String[] args) {
        System.out.println("Before Exception..");

        try {
           int a = 10/0;
        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println(e.toString());
        }

        System.out.println("After Handling Exception");
    }
}
