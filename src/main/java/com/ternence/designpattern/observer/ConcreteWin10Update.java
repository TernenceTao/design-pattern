package com.ternence.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * create by 陶江航 at 2017/11/5 16:10
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 具体的观察目标对象(win10的更新)
 */
public class ConcreteWin10Update extends Observable {

    public ConcreteWin10Update() {
        super();
        System.out.println("创建win10更新对象,等待被别人订阅");
    }

    /**
     * 开发者调用这个方法表示这个被观察的目标对象可以发送通知给观察对象了
     * <p>
     * 这个方法是同步的，并且会立刻返回，以便于能够及时的<b>打开</b>通知的开关
     */
    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

    /**
     * 调用这个方法关闭通知
     * <p>
     * 这个方法是同步的，并且会立刻返回，以便于能够及时的<b>关闭</b>通知的开关
     */
    @Override
    public synchronized void clearChanged() {
        super.clearChanged();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        System.out.println("第" + countObservers() + "个人" + o + "订阅了win10更新");
    }

    @Override
    public String toString() {

        return "ConcreteWin10Update";
    }
}
