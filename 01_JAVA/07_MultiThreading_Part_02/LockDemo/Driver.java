package LockDemo;

public class Driver {
    static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable t1 = ()->account.withdraw("Me",4000);
        Runnable t2 = ()-> account.withdraw("Papa",2000);

        new Thread(t1).start();
        new Thread(t2).start();


    }
}
