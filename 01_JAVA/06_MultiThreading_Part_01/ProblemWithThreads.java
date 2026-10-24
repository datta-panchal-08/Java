class Addition{
    int sum = 0;
   synchronized public void add(){
        sum=sum+1;
    }
}

class MyThreadTask1 extends Thread{
    Addition add;

    int sum = 0;

    MyThreadTask1(Addition add){
        this.add = add;
    }

    @Override
    public void run(){
      for(int i = 1;i<1000;i++){
         add.add();
      }
        System.out.println(sum);
    }
}

class MyThreadTask2 extends Thread{
    Addition add;
    int sum = 0;
    MyThreadTask2(Addition add){
        this.add = add;
    }
    @Override
    public void run(){
        for(int i = 1;i<1000;i++){
            add.add();
        }
        System.out.println(sum);
    }
}

public class ProblemWithThreads {
    static void main(String[] args) throws InterruptedException {
        Addition add = new Addition();
       MyThreadTask1 t1 = new MyThreadTask1(add);
       MyThreadTask2 t2 = new MyThreadTask2(add);

       t1.start();
       t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Sum = "+add.sum);
    }
}
