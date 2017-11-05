package com.ternence.designpattern.proxy.cglib;

import com.ternence.designpattern.proxy.dynamic.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * create by 陶江航 at 2017/11/5 18:40
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 测试cglib的动态代理
 */
public class CglibDynamicProxyTest {

    @Test
    public void intercept() throws Exception {
        CglibDynamicProxy dynamicProxy = new CglibDynamicProxy();
        InterfacelessClass interfacelessClass = (InterfacelessClass)
                dynamicProxy.getProxy(InterfacelessClass.class);
        User user = interfacelessClass.findUserByName("Ternence");
        System.out.println(user);
    }

}