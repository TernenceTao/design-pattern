package com.ternence.designpattern.adapter;

/**
 * create by 陶江航 at 2017/11/5 21:03
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description SLF4J的日志接口
 */
public interface Slf4jLogger {

    void debug(String msg);

    void error(String msg);

    void info(String msg);

}
