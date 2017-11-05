package com.ternence.designpattern.observer;

import org.junit.Test;

/**
 * create by 陶江航 at 2017/11/5 16:13
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 观察者模式测试
 */
public class ObservablePatternTest {

    @Test
    public void testObservablePattern() {
        ConcreteWin10Update win10Update = new ConcreteWin10Update();
        Ternence ternence = new Ternence();
        Charles charles = new Charles();
        win10Update.addObserver(ternence);
        win10Update.addObserver(charles);

        win10Update.setChanged();
        win10Update.notifyObservers("win10秋季创意者更新来了");

        //每次调用更新方法之后就会clear一下change对象
        win10Update.setChanged();
        win10Update.notifyObservers("第二波更新又来了");
    }
}