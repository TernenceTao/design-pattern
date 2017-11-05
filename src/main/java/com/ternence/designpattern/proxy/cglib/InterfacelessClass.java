package com.ternence.designpattern.proxy.cglib;

import com.ternence.designpattern.proxy.dynamic.User;

/**
 * create by 陶江航 at 2017/11/5 18:41
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 没有实现任何接口的一个普通类
 */
public class InterfacelessClass {

    public User findUserByName(String name) {
        System.out.println("根据用户名查找用户");
        if (name == null)
            return null;
        return new User(name);
    }
}
