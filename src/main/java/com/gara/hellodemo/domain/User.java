package com.gara.hellodemo.domain;

import javax.persistence.Id;

public class User {
    @Id
    private String userId;
//    @NotEmpty
    private String userName;
//    @NotEmpty
    private Integer age;

    public User() {
    }

    public User(String userId, String userName, Integer age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
