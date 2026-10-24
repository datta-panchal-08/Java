package ExecutorService;

public class CertificationSender implements Runnable{
    private final String studentName;

    CertificationSender(String s){
        this.studentName = s;
    }

    @Override
    public void run(){
        System.out.println("Sending Certificate To : "+studentName+" By Thread "+Thread.currentThread().getName());

        try {
              Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Certificate Sent To : "+studentName);

    }
}
