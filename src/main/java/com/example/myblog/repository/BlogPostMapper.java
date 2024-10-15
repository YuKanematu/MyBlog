package com.example.myblog.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myblog.model.BlogPost;

@Mapper
public interface BlogPostMapper {
	
    List<BlogPost> findAll();

    BlogPost findById(Long id);

    void insert(BlogPost blogPost);

    void update(BlogPost blogPost);

    void delete(Long id);
    
}
