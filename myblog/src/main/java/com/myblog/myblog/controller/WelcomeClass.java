package com.myblog.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeClass {

    //(1) GetMapping 작성하기
    @GetMapping("/webblog")
    public String entryPoint(){
        return "Hi";
    }
}
