package com.myblog.myblog.vo;

import java.util.Date;

public class WebBlogRow {

    Integer id;
    String title;
    String content;
    String username;
    Date createdAt;

    //생성자 초기 값 작업 (code - generate )
    public WebBlogRow(Integer id, String title, String content, String username, Date createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createdAt = createdAt;
    }

    public WebBlogRow(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    //Getter
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    //Setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
