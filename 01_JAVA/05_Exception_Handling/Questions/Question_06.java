package Questions;

public class Question_06 {
    static void main(String[] args) {
        System.out.println("Hello jii.. "+m1());
    }

    static int m1(){
        try {
            return  10;
        }finally {
            System.out.println("Finally...");
        }
    }
}
