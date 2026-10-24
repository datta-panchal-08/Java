package LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal = 30000;

    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(String threadName,int amount){
        System.out.println(threadName+" is trying to withdraw "+amount);
        lock.lock();
        try {
            System.out.println(threadName+" acquired lock");
            if(bal>amount){
                Thread.sleep(2000);
                bal = bal-amount;
                System.out.println("Withdrawn : "+amount+" Remaining : "+bal);
            }else {
                System.out.println("Insufficient Balance...");
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}
