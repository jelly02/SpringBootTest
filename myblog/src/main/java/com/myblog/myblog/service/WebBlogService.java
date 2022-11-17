package com.myblog.myblog.service;

import com.myblog.myblog.mapper.WebBlogMapper;
import com.myblog.myblog.vo.WebBlogRow;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WebBlogService {
    
    private WebBlogMapper webBlogMapper;
    
    //생성자                             param을 구분하기 위해 앞에 '_'사용
    public WebBlogService(WebBlogMapper _webBlogMapper){
        this.webBlogMapper = _webBlogMapper;
    }

    public List<WebBlogRow> getAllList() {
        return  this.webBlogMapper.getAllBlogs();
    }



}
