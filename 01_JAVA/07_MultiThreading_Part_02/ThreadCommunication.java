public class ThreadCommunication {
   public static void main(String[] args)  throws InterruptedException {
        ThreadA a1 = new ThreadA();
        ThreadA a2 = new ThreadA();
        a1.start();

        synchronized (a1){
            System.out.println("Main Thread Calling Wait()...");
            a1.wait();
            System.out.println("Main Thread Get Notify....");
            System.out.println("Total : "+a1.t);
        }
    }
}

class ThreadA extends Thread{
    int t = 0;

    @Override
    public void run(){
        synchronized(this){
            System.out.println("Child Thread Started...");
            for (int i = 0;i<=100;i++){
                t=t+i;
            }
            this.notify();
            System.out.println("Child Thread Giving Notification....");
        }
    }
}
