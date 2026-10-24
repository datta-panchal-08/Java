package ThrowDemo;

public class ThrowDemo {
    static void main(String[] args) {

      try {
          withdraw(500,1000);
      }catch (Exception e){
          System.out.println("Error "+e.getMessage());
      }

    }

    public static void withdraw(double amt,double bal) throws Exception{
        if(amt>bal){
            throw  new Exception("Insufficient Balance..");
        }
        System.out.println("Withdraw Successfull..");
    }
}
