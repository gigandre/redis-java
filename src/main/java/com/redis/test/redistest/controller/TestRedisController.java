package com.redis.test.redistest.controller;

import com.redis.test.redistest.dto.User;
import com.redis.test.redistest.sevice.TestRedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedisController{

    @Autowired
    TestRedisService testRedisService;
    
    @GetMapping("/redis/{nome}")
    public String getName(@PathVariable String nome) {
        System.out.printf("\n%S\n", nome);

        testRedisService.getUserNameObjectByUserString(nome);
        testRedisService.getUserStringNameByUserObject(new User(nome));
        testRedisService.getUserStringNameByUserString(nome);
        testRedisService.getUserNameObjectByUserObject(new User(nome));

        return "finished";
    }


}
