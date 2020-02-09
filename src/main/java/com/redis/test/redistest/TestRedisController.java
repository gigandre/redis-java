package com.redis.test.redistest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cache.annotation.Cacheable;

@RestController
public class TestRedisController{
    
    @GetMapping("/redis/{nome}")
    @Cacheable(value = "nomeController", key = "#nome")
    public String getName(@PathVariable String nome) {
        System.out.printf("\n%S", nome);
        return nome;
    }
}