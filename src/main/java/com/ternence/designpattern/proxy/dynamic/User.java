package com.ternence.designpattern.proxy.dynamic;

/**
 * create by 陶江航 at 2017/11/5 17:36
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 用户对象
 */
public class User {

    private String username;


    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
