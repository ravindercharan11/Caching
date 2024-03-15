package com.springcache.springcache;

import org.springframework.cache.annotation.Cacheable;

public class Article {

    private int id;
     public int getId(){
         return id;
     }

    public void setId(int id) {
        this.id = id;
    }
}
