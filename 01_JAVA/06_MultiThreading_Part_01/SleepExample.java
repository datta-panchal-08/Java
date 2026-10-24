
class SleepThread extends Thread{
    @Override
    public void run(){
        for (int i = 0;i<=5;i++){
            System.out.println("Child "+getName()+" --- "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class SleepExample {
    static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        t1.start();
    }
}
