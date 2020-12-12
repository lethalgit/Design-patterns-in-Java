package com.designpatterns.strategy.duck.behaviors.Impl;

import com.designpatterns.strategy.duck.behaviors.FlyBehavior;

/**
 * created by saurabhgupta on 12/12/20
 */
public class FlyNone implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("The duck doesn't fly");
    }
}
