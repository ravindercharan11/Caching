package com.springcache.springcache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@org.springframework.stereotype.Service
public class ArticleService {

    @Cacheable("articles") //this annotation use for storing particular object in cache
    public void fatchArtical(Integer articleId){
        System.out.println("Fatching artcile: "+articleId);
    }
   @CachePut("articles") //this annotation just updating the boject
    public void updateArticle(Article a) {
        System.out.println("update article with id"+a.getId());
    }

    @CacheEvict("articles") //remove object from cache if apply on the method
    public void deleteArticle(Integer articleId){
        System.out.println("Deleteing article:+articleId");
    }
}
