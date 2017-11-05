package com.ternence.designpattern.facade;

/**
 * create by 陶江航 at 2017/11/5 21:32
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 实现Log4j打印的日志
 */
public class Log4jLogger implements Logger {

    @Override
    public void debug(String msg) {
        System.out.println("Log4jLogger:" + msg);
    }

    @Override
    public void error(String msg) {
        System.out.println("Log4jLogger:" + msg);
    }

    @Override
    public void info(String msg) {
        System.out.println("Log4jLogger:" + msg);
    }
}
