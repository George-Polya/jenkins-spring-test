package com.example.demo.dto;


import org.springframework.data.redis.core.RedisHash;

@RedisHash(value="member", timeToLive = 60)
public class Member {
    private long id;
    private String name;

    public Member(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
