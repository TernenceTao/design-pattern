package com.ternence.designpattern.facade;

/**
 * create by 陶江航 at 2017/11/5 21:31
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 日志门面的接口，为客户程序使员工提供统一的接口，
 * <p>
 * 具体的实现不用客户端知道，这样的程序更为通用，日后也更容易维护
 */
public interface Logger {

    void debug(String msg);

    void error(String msg);

    void info(String msg);

}
