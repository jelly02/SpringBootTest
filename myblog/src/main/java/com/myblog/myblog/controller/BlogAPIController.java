package com.myblog.myblog.controller;

import com.myblog.myblog.controller.dto.WebBlogResponseDto;
import com.myblog.myblog.service.WebBlogService;
import com.myblog.myblog.vo.WebBlogRow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class BlogAPIController {

    private WebBlogService webBlogService;

    public BlogAPIController(WebBlogService webBlogService){
        this.webBlogService = webBlogService;
    }

    @GetMapping("/api/getNextList")
    public List<WebBlogResponseDto> getNextList(@RequestParam Integer last){

        //화면에 나오는 컨트롤러가 아니기 때문에 테스트하려면 콘솔에 찍히게 해야함
        System.out.println("IN getNextList");

        List<WebBlogResponseDto> returnDatas = new ArrayList<>();

        // vo로 객체를 생성해서 dto에 전달해서
        returnDatas.add(new WebBlogResponseDto(
                new WebBlogRow(999, "test title","test content", "test username")));

        returnDatas.add(new WebBlogResponseDto(
                new WebBlogRow(1111, "test title222","test content222", "test username222")));

        return returnDatas;
    }

}
