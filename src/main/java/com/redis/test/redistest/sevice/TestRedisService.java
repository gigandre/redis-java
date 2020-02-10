package com.redis.test.redistest.sevice;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import com.redis.test.redistest.dto.User;

@Service
@Slf4j
public class TestRedisService{
   

    @Cacheable(value = "getUserStringNameByUserObject", key = "#user")
    public String getUserStringNameByUserObject(User user){
        log.info("getUserStringNameByUserObject -> " + user);
        return user.getNome();
    }

    @Cacheable(value = "getUserStringNameByUserString", key = "#user")
    public String getUserStringNameByUserString(String user){
        log.info("getUserStringNameByUserString -> " + user);
        return user;
    }

    @Cacheable(value = "getUserNameObjectByUserString", key = "#user")
    public User getUserNameObjectByUserString(String user){
        log.info("getUserStringNameByUserString -> " + user);
        return new User(user);
    }


    @Cacheable(value = "getUserNameObjectByUserObject", key = "#user")
    public User getUserNameObjectByUserObject(User user){
        log.info("getUserNameObjectByUserObject -> " + user);
        return user;
    }

}