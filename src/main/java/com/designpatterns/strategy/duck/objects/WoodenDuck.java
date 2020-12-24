package com.designpatterns.strategy.duck.objects;

import com.designpatterns.strategy.duck.behaviors.Impl.FlyNone;
import com.designpatterns.strategy.duck.behaviors.Impl.QuackMute;

/**
 * created by saurabhgupta on 12/12/20
 */
public class WoodenDuck extends Duck {

    public WoodenDuck() {
        flyBehavior = new FlyNone();
        quackBehavior = new QuackMute();
    }

    @Override
    public void display() {
        System.out.println("The wooden duck looks beautiful.");
    }
}
