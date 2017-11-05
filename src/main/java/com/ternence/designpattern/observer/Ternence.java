package com.ternence.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * create by 陶江航 at 2017/11/5 16:11
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 观察者对象, 接受他订阅的更新
 */
public class Ternence implements Observer {

    public Ternence() {
        super();
        System.out.println("创建订阅者对象" + this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this + "你关心的内容共更新了\n\r" + "发送者是:" + o + "\n\r发送的内容是:" + arg);
    }

    @Override
    public String toString() {

        return "Ternence";
    }
}
