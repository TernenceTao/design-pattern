package com.ternence.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * create by 陶江航 at 2017/11/5 18:30
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 使用cglib实现动态代理
 * <p>
 * 由于cglib使用动态创建子类的方式实现实现动态代理,所以对于final修饰的方法无法代理
 * <p>
 * 所以他也不是全能的,使用的时候可以酌情选择JDK的动态代理和cglib的动态代理
 */
public class CglibDynamicProxy implements MethodInterceptor {
    //cglib用于生成代理对象的对象
    private Enhancer enhancer = new Enhancer();

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("前置代理");
        Object result = methodProxy.invokeSuper(o, args);
        System.out.println("后置");
        return result;
    }

    public Object getProxy(Class aClass) {
        enhancer.setSuperclass(aClass);
        enhancer.setCallback(this);
        //使用无参数构造器构造对象，当然也可以使用带参数的构造器
        return enhancer.create();
    }
}
