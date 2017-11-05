package com.ternence.designpattern.proxy.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * create by 陶江航 at 2017/11/5 17:37
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 用户服务的实现类
 */
public class UserServiceImpl implements UserService {
    private Map<String, User> userMap = new HashMap<>();

    {
        userMap.put("Ternence", new User("Ternence"));
    }

    @Override
    public User getUserByName(String name) {
        System.out.println("执行真正的方法");
        if (name == null) return null;
        return userMap.get(name);
    }
}
