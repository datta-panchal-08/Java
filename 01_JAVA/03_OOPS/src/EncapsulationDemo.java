public class EncapsulationDemo {
    private String accountHolderName;
    private double balance;

    EncapsulationDemo(String accName,double bal){
        this.accountHolderName = accName;
        this.balance = bal;
    }

    public static void main(String[] args) {
        EncapsulationDemo s1 = new EncapsulationDemo("Dattaray",100000);
        s1.showBalance();
    }

    void showBalance(){
        System.out.println("Your Current Account Balance is : "+balance);
    }
}
