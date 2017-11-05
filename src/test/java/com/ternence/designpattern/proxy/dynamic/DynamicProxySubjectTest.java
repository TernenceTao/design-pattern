package com.ternence.designpattern.proxy.dynamic;

import org.junit.Test;

/**
 * create by 陶江航 at 2017/11/5 17:34
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 测试动态代理
 * <p>
 * 有兴趣的话可以去把生成代理类的字节码导出到磁盘上,用反编译工具打开看看
 *
 * JDK实现动态代理需要实现类通过接口定义业务方法，对于没有接口的类，如何实现动态代理呢
 */
public class DynamicProxySubjectTest {

    @Test
    public void invoke() throws Exception {
        DynamicProxyInvocationHandler invocationHandler = new DynamicProxyInvocationHandler();
        //这个target在真正使用的时候就是哪个写代理代码的时候还不知道他是谁的对象,他是在未来的某个时间生成
        //比如这个对象我没有源码，但是我想在他执行之前或者之后做点事情
        invocationHandler.setTarget(new UserServiceImpl());
        //他会为 userService 对象生成一个代理对象
        Object proxyObj = invocationHandler.getProxy();
        UserService proxy = (UserService) proxyObj;
        //通过生成的代理对象调用真正的对象的方法
        User user = proxy.getUserByName("Ternence");
        System.out.println(proxyObj.getClass() + "-" + user);
    }

}