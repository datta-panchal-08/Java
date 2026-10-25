package com.example.SpringBootProject01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProject01Application implements CommandLineRunner {
    @Autowired
    private Notification notification;

   public SpringBootProject01Application(Notification notification){
       this.notification = notification;
   }

   public SpringBootProject01Application(){

   }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject01Application.class, args);
	}

    public void run(String... args){
       notification.notifyUser();
    }

}
