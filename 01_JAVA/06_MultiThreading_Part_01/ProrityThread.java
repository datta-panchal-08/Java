
class  MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class ProrityThread {
    static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.setName("Thread-t1");
        t.setPriority(Thread.MIN_PRIORITY);


        MyThread2 t1 = new MyThread2();
        t1.setName("Thread-t2");
        t1.setPriority(Thread.MAX_PRIORITY);

        t.start();
        t1.start();
    }
}
