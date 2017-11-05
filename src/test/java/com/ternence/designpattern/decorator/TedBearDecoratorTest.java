package com.ternence.designpattern.decorator;

import org.junit.Test;

/**
 * create by 陶江航 at 2017/11/5 20:25
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 测试装饰器是否能正常工作
 */
public class TedBearDecoratorTest {

    @Test
    public void testDecorator() {
        WhiteShirt whiteShirt = new WhiteShirt();
        whiteShirt.setWidth(46);
        whiteShirt.setLength(66);
        //用泰迪熊装饰了白衬衫,至此白衬衫上就有了泰迪熊
        TedBearDecorate tedWhiteShirt = new TedBearDecorate(whiteShirt);
        //给泰迪熊白衬衫加上花儿
        FlowerDecorate tedWithFlowerWhiteShirt = new FlowerDecorate(tedWhiteShirt);
        //more decorates ...
        String material = tedWithFlowerWhiteShirt.material();
        //打印白衬衫最后得到了什么
        System.out.println(material);
    }
}