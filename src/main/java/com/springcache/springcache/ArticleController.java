package com.springcache.springcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    ArticleService service;

    @GetMapping("{id}")
    public void fatchArticle(@PathVariable("id") Integer articleId){
        service.fatchArtical(articleId);
    }
    @PutMapping
    public void updateArticle(@RequestBody Article a){
        service.updateArticle(a);
    }
    @DeleteMapping("{id}")
    public void deleteArticle(@PathVariable("id")Integer articleId){
       service.deleteArticle(articleId);
    }
}
