package com.ternence.designpattern.adapter;

/**
 * create by 陶江航 at 2017/11/5 21:04
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description Log4j日志的适配器，将Log4j的日志调用转到slf4j
 */
public class Log4jLoggerAdapter implements Log4jLogger {
    private Slf4jLogger slf4jLogger;

    public Log4jLoggerAdapter(Slf4jLogger slf4jLogger) {
        this.slf4jLogger = slf4jLogger;
    }

    @Override
    public void debug(String msg) {
        if (slf4jLogger == null) {
            //路由到没有日志实现
            return;
        }
        slf4jLogger.debug(msg);
    }

    @Override
    public void error(String msg) {
        if (slf4jLogger == null) {
            //路由到没有日志实现
            return;
        }
        slf4jLogger.error(msg);
    }

    @Override
    public void info(String msg) {
        if (slf4jLogger == null) {
            //路由到没有日志实现
            return;
        }
        slf4jLogger.error(msg);
    }
}
