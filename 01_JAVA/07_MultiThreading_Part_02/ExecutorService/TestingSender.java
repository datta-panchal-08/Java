package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSender {
    static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(8);
        String[] studentList = {
                "Riya",
                "Dattatray",
                "Ganesh",
                "Prashant",
                "Mohaneshwar",
                "Dnyaneshwar",
                "Akash",
                "Abhi"
        };

        for(String std:studentList){
            CertificationSender task = new CertificationSender(std);
            service.submit(task);
        }
    }
}
