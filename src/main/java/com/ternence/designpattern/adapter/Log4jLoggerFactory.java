package com.ternence.designpattern.adapter;

/**
 * create by 陶江航 at 2017/11/5 21:21
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description log4j的工厂对象
 */
public class Log4jLoggerFactory {

    /**
     * 返回具有相同接口的适配器
     *
     * @param aClass 日志器的名称
     * @return 日志接口的实现
     */
    public static Log4jLogger getLogger(Class aClass) {

        return new Log4jLoggerAdapter(new Slf4jLoggerImpl());
    }

}
