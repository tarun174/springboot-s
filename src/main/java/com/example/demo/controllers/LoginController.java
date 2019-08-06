package com.example.demo.controllers;

import com.example.demo.models.Credentials;
import com.example.demo.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("login")
    public void login(@RequestBody Credentials credentials) {
        loginService.validateLogin(credentials);
    }
}
