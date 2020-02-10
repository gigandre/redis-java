package com.redis.test.redistest.dto;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RedisHash("User")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable{
    private static final long serialVersionUID = -1316764895960340918L;

    public User(String user) {
        this.nome = user;
    }
    private String nome;
}