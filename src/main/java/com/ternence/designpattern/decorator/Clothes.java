package com.ternence.designpattern.decorator;

/**
 * create by 陶江航 at 2017/11/5 20:13
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 衣服的抽象接口
 */
public interface Clothes extends Cloth {

    /**
     * 衣服使用的材料,这里简单的用一个字符串描述
     *
     * @return 衣服使用的材料
     */
    String material();

}
