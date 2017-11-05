package com.ternence.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * create by 陶江航 at 2017/11/5 17:23
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 动态代理对象, 这个代理是针对那些还不知道代理对象是谁的类型
 * <p>
 * 静态代理一个真实主题角色必须对应一个代理主题角色，这将导致系统中的类个数急剧增加
 */
public class DynamicProxyInvocationHandler implements InvocationHandler {
    //需要被代理的对象
    private Object target;

    public DynamicProxyInvocationHandler(Object target) {
        this.target = target;
    }

    public DynamicProxyInvocationHandler() {
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    /**
     * 代理真实对象的方法,真实对象的所有方法都可以通过这个方法代理
     * <p>
     * 值得注意的是proxy这个对象永远不能在invoke方法中使用,因为你一使用它就会循环的调用invoke方法导致栈溢出
     * 实际上可以说这个参数是真的没什么卵用
     * <p>
     * 被代理类的已经被代理类继承的所有方法调用都会分发到这里，所以这里还要做一层判断是哪个方法再进行调用
     *
     * @param proxy  jdk生成的对真实对象的代理对象
     * @param method 被代理的方法
     * @param args   被代理的方法的参数
     * @return 被代理的方法的返回值
     * @throws Throwable 可能抛出的异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法执行之前");
        if (target == null) {
            throw new IllegalArgumentException("代理对象为null");
        }
        Object result = method.invoke(target, args);//反射调用方法
        System.out.println("方法执行之后");
        return result;
    }

    /**
     * 获取目标对象的代理对象
     *
     * @return 代理对象
     */
    public Object getProxy() {
        if (target == null)
            throw new IllegalArgumentException("代理对象为null");
        /*target实现的接口或者target代表的接口*/
        System.out.println(Arrays.toString(target.getClass().getInterfaces()));
        /*JDK的动态代理不支持为没有实现接口的类生成代理类,使用起来很局限*/
        /*他的原理是生成实现代理对象实现的接口的字节码,再通过调用代理对象的方法的时候调用InvocationHandler的invoke方法*/
        /*原理和静态代理还是一样的,都需要一个接口让真正的对象和代理对象实现*/
        /*基于以上原因就有了cglib实现的第二种动态代理方式*/
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
