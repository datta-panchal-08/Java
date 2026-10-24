 class PrintTableWithMethod {

    public void printTable(int n) {

        synchronized (this) {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        Thread.currentThread().getName() + " " + (n * i)
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class PrintTableWithBlock{
    static void main(String[] args) {
       PrintTableWithMethod t = new PrintTableWithMethod();

       Thread t1 = new Thread(() ->t.printTable(5));
       Thread t2 = new Thread(() ->t.printTable(6));

       t1.setName("Thread-01 : ");
       t2.setName("Thread-02 : ");

       t1.start();
       t2.start();

    }
}