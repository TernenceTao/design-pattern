package com.ternence.designpattern.proxy.staticpattern;

/**
 * create by 陶江航 at 2017/11/5 17:17
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 代理主题对象，代理了RealSubject的功能
 */
public class ProxySubject implements Subject {

    //实际使用的时候,这个RealSubject代表那些不能被直接
    //引用或者因为某些安全因素需要被代理访问的对象
    private RealSubject realSubject;

    public ProxySubject() {

        realSubject = new RealSubject();
    }

    public void preRequest() {

        System.out.println("请求执行前");
    }

    @Override
    public void request() {

        preRequest();

        realSubject.request();

        afterRequest();
    }


    public void afterRequest() {

        System.out.println("请求执行后");
    }
}
