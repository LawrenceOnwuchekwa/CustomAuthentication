package com.masterhills.customauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/auth")
    public String show(){
        return "loggedIN";
    }
}
