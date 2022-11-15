package com.myblog.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeClass {

    
    @GetMapping("/webblog") //(1) GetMapping 작성하기
    @ResponseBody //(2) View 안 찾고 여기서 알아서 할게! -> 오류 안 남
    public String entryPoint(){
        return "Hi"; //(1-1) Hi 라는 템플릿이 없어서 오류 남
    }

    @GetMapping("/webblogpage")
    @ResponseBody
    public String viewPage(){
        return "Index";
    }
}
