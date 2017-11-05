package com.ternence.designpattern.adapter;

/**
 * create by 陶江航 at 2017/11/5 21:09
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description log4j的日志实现
 */
public class Log4jLoggerImpl implements Log4jLogger {
    @Override
    public void debug(String msg) {
        System.out.println("log4j:" + msg);
    }

    @Override
    public void error(String msg) {
        System.out.println("log4j:" + msg);

    }

    @Override
    public void info(String msg) {
        System.out.println("log4j:" + msg);
    }
}
