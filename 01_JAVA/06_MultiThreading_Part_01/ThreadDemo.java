
class MyThreadExample extends Thread{

    @Override
    public void run(){
       for(int i = 0;i<6;i++){
           System.out.println("Thread Child Class..");
       }
    }
}


public class ThreadDemo {
    static void main(String[] args) {
        MyThreadExample t = new MyThreadExample();
       t.start();
        for(int i = 0;i<6;i++){
            System.out.println("Main Class..");
        }

    }

}
