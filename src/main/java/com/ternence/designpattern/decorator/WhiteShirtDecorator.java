package com.ternence.designpattern.decorator;

/**
 * create by 陶江航 at 2017/11/5 20:20
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 白衬衫的装饰器
 * <p>
 * 现在我要利用这个类给白衬衫加一点装饰
 */
public abstract class WhiteShirtDecorator implements Clothes {
    private Clothes clothes;

    public WhiteShirtDecorator(Clothes clothes) {
        if (clothes == null) {

            throw new IllegalArgumentException("衣服为null");
        }
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    @Override
    public String color() {

        return clothes.color();
    }

    @Override
    public int[] size() {

        return clothes.size();
    }
}
