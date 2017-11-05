package com.ternence.designpattern.facade;

/**
 * create by 陶江航 at 2017/11/5 21:34
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 日志工厂
 */
public class LoggerFactory {

    public static Logger getLogger() {

        return new Slf4jLogger();
    }
}
