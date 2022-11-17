package com.myblog.myblog.mapper;

import com.myblog.myblog.vo.WebBlogRow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WebBlogMapper {
    List<WebBlogRow> getAllBlogs();
    List<WebBlogRow> getPage(@Param("page") Integer page, @Param("getCount") Integer getCount);

}
