package com.ternence.designpattern.adapter;

/**
 * create by 陶江航 at 2017/11/5 21:10
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description SLF4J的日志实现
 */
public class Slf4jLoggerImpl implements Slf4jLogger {
    @Override
    public void debug(String msg) {
        System.out.println("slf4j:" + msg);
    }

    @Override
    public void error(String msg) {
        System.out.println("slf4j:" + msg);
    }

    @Override
    public void info(String msg) {
        System.out.println("slf4j:" + msg);
    }
}
