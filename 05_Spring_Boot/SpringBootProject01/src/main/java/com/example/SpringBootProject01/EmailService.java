package com.example.SpringBootProject01;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
    @Override
    public String sendMessage() {
        return "Email : You Have Got New Message";
    }
}
