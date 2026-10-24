package Questions;

public class Question_03 {
    static void main(String[] args) {
        // finally will run without catch block also
        try {
            int arr[] = {10,20,309};
            System.out.println(arr[2]);
        }finally {
            System.out.println("I am Finally Block...");
        }
    }
}
