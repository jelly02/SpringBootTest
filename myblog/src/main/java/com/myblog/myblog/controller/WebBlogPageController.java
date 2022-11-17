package com.myblog.myblog.controller;

import com.myblog.myblog.service.WebBlogService;
import com.myblog.myblog.vo.WebBlogRow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebBlogPageController {

    private WebBlogService webBlogService;

    //(1) 생성자
    public WebBlogPageController (WebBlogService webBlogService) {
        this.webBlogService = webBlogService;
    }

    //(2) 초기의 값을 가져오는 함수
    @GetMapping("/list")
    public String getBlogAllList(Model _model){

        //리스트에 담아서 저장                  서비스에서 가져온 값
        List<WebBlogRow> blogAllList = this.webBlogService.getAllList();
//        List<WebBlogRow> blogAllList = this.webBlogService.getPageList(0);
        _model.addAttribute("rows", blogAllList);

        return "blogmain";
    }

}
