package com.example.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.myblog.model.BlogPost;
import com.example.myblog.service.BlogPostService;

@Controller
@RequestMapping("/")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @GetMapping
    public String listPosts(Model model) {
        model.addAttribute("posts", blogPostService.findAll());
        return "blog/list";
    }

    @GetMapping("/new")
    public String newPostForm(Model model) {
        model.addAttribute("post", new BlogPost());
        return "blog/form";
    }

    @PostMapping
    public String savePost(@ModelAttribute BlogPost post) {
        post.setAuthor("AuthorName");  // ここで適切な著者名を設定
        blogPostService.save(post);
        return "redirect:/";
    }


    @GetMapping("blog/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        model.addAttribute("post", blogPostService.findById(id));
        return "blog/view";
    }

    @GetMapping("blog/{id}/edit")
    public String editPostForm(@PathVariable Long id, Model model) {
        model.addAttribute("post", blogPostService.findById(id));
        return "blog/form";
    }

    @PostMapping("blog/{id}/delete")
    public String deletePost(@PathVariable Long id) {
        blogPostService.delete(id);
        return "redirect:/";
    }
    
}
