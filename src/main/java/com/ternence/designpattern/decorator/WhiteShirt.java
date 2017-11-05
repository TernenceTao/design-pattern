package com.ternence.designpattern.decorator;

/**
 * create by 陶江航 at 2017/11/5 20:15
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 一件白衬衫
 */
public class WhiteShirt implements Clothes {
    private int width;
    private int length;

    @Override
    public String material() {

        return "{" + "颜色:" + color() + "," +
                "宽度:" + size()[0] + "cm," +
                "长度:" + size()[1] + "cm" +
                "}";
    }

    @Override
    public String color() {

        return "白色";
    }

    @Override
    public int[] size() {

        return new int[]{width, length};
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
