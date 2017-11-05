package com.ternence.designpattern.facade;

import org.junit.Test;

/**
 * create by 陶江航 at 2017/11/5 21:36
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 门面设计模式测试
 */
public class FacadeDesignPatternTest {
    private Logger logger = LoggerFactory.getLogger();

    @Test
    public void testFacade() {
        //通过门面设计模式使得你可以不用关心日志是怎么实现的,怎么打印的
        //十分具有扩展性
        logger.info("日志器发来信息了");
    }
}