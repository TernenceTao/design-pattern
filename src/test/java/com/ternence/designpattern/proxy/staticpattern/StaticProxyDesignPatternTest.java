package com.ternence.designpattern.proxy.staticpattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * create by 陶江航 at 2017/11/5 17:21
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 测试静态代理模式
 */
public class StaticProxyDesignPatternTest {

    @Test
    public void testRequest() throws Exception {
        ProxySubject subject = new ProxySubject();
        subject.request();
    }

}