package CustomExceptions;

public class ATM {
    static void main(String[] args) {
      try {
          withdraw(25000,4000);
      }catch (InSufficientBalException e){
          System.out.println("Exception Insufficient Bal "+e.getMessage());
      }
    }

    public static  void withdraw(double amt , double bal) throws InSufficientBalException{
        if(amt>bal){
            throw new InSufficientBalException("Your Balnce is : "+bal+" You Requesting Amount is : "+amt);
        }
        System.out.println("Withdrawal Successfull Of "+amt);
    }
}
