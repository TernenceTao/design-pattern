package com.ternence.designpattern.decorator;

/**
 * create by 陶江航 at 2017/11/5 20:24
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 给白衬衣加上一个泰迪熊的装饰器
 */
public class TedBearDecorate extends WhiteShirtDecorator {
    public TedBearDecorate(Clothes clothes) {
        super(clothes);
    }

    @Override
    public String material() {

        return "泰迪熊+" + getClothes().material();
    }
}
