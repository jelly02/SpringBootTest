package com.myblog.myblog.controller.dto;

import com.myblog.myblog.vo.WebBlogRow;
import lombok.Getter;

import java.util.Date;

@Getter
public class WebBlogResponseDto {

    // 값을 변경하지 못하게 getter 로 생성 -> 왜냐면 응답이니까!

    Integer id;
    String title;
    String content;
    String username;

    public WebBlogResponseDto(WebBlogRow _row){
        this.id = _row.getId();
        this.title = _row.getTitle();
        this.content = _row.getContent();
        this.username = _row.getUsername();
    }
}
