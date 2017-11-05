package com.ternence.designpattern.adapter;

import org.junit.Test;

/**
 * create by 陶江航 at 2017/11/5 21:11
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 适配器设计模式测试
 */
public class AdapterDesignPatternTest {
    Log4jLogger logger = Log4jLoggerFactory.getLogger(getClass());

    @Test
    public void testAdapterLogger() {
        logger.info("lg4j发来日志");
    }
}