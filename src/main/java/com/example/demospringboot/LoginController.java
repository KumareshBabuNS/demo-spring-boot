package com.example.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    AppleStoreLoginRepository loginRepository;

    @PostMapping("/login")
    public boolean login(@RequestBody AppleStoreLogin loginBody){
        return loginRepository.countAllByUsernameAndPassword(loginBody.getUsername(), loginBody.getPassword()) > 0;
    }

    @PostMapping("/addStore")
    public void add(@RequestBody AppleStoreLogin loginBody){
        loginRepository.save(loginBody);
    }

}
