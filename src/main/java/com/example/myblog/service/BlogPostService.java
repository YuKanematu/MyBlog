package com.example.myblog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.myblog.model.BlogPost;
import com.example.myblog.repository.BlogPostMapper;

@Service
public class BlogPostService {

    private final BlogPostMapper blogPostMapper;

    public BlogPostService(BlogPostMapper blogPostMapper) {
        this.blogPostMapper = blogPostMapper;
    }

    public List<BlogPost> findAll() {
        return blogPostMapper.findAll();
    }

    public BlogPost findById(Long id) {
        return blogPostMapper.findById(id);
    }

    public void save(BlogPost blogPost) {
        if (blogPost.getId() == null) {
            blogPostMapper.insert(blogPost);
        } else {
            blogPostMapper.insert(blogPost);
        }
    }

    public void delete(Long id) {
        blogPostMapper.delete(id);
    }
}
