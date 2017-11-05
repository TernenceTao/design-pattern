package com.ternence.designpattern.proxy.staticpattern;

/**
 * create by 陶江航 at 2017/11/5 17:16
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 真实的对象
 */
public class RealSubject implements Subject {
    @Override
    public void request() {

        System.out.println("真实对象的request方法执行");
    }
}
