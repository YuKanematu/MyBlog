package com.example.myblog.model;

import lombok.Data;

@Data
public class BlogPost {
    private Long id;
    private String title;
    private String content;
    private String author;
}
