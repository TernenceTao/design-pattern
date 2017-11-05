package com.ternence.designpattern.decorator;

/**
 * create by 陶江航 at 2017/11/5 20:10
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 布料的抽象接口
 */
public interface Cloth {

    /**
     * @return 返回布的颜色
     */
    String color();

    /**
     * @return 布的长和宽度
     */
    int[] size();
}
