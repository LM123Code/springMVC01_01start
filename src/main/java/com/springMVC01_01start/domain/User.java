package com.springMVC01_01start.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LM_Code
 * @create 2019-04-07-16:28
 */
public class User implements Serializable {
    private String username;
    private int age;
    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
