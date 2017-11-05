package com.ternence.designpattern.decorator;

/**
 * create by 陶江航 at 2017/11/5 20:34
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 花朵装饰
 * <p>
 * 这种写法不够通用，不能很好的复用这个装饰
 */
public class FlowerDecorate extends WhiteShirtDecorator {

    public FlowerDecorate(Clothes clothes) {
        super(clothes);
    }

    @Override
    public String material() {

        return "花儿+" + getClothes().material();
    }
}
