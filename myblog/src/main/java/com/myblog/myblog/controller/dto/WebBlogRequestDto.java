package com.myblog.myblog.controller.dto;

import com.myblog.myblog.vo.WebBlogRow;
import lombok.Setter;

import java.util.Date;

@Setter
public class WebBlogRequestDto {

    // DTO : 객체 생성, 전달, 값을 입력할 수도 있기 때문에 Setter 추가 (insert, delete 때 사용)
    Integer id;
    String title;
    String content;
    String username;

    //(1) 객체 생성
    public WebBlogRow createBlogObject() {
        
        // 생성자에 4개의 인자를 갖는 메소드를 만들어줘야함
        return new WebBlogRow(this.id, this.title, this.content, this.username);
    }
}
