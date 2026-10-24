class JoinThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class JoinExample {

    public static void main(String[] args) throws InterruptedException {

        JoinThread j1 = new JoinThread();

        j1.setName("Child Thread..");

        j1.start();   // pehle thread start karo

        j1.join();    // main thread yahan wait karega

        for (int i = 0; i <= 5; i++) {
            System.out.println("Main..");
        }
    }
}