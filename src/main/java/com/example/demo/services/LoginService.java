package com.example.demo.services;

import com.example.demo.models.Credentials;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String validateLogin(Credentials credentials) {
        if(credentials.getUserName().equals("admin") && credentials.getPassword().equals("admin")) {
           return  "Login Successful";
        } else {
            throw new RuntimeException("Invalid Credentials");
        }
    }
}
