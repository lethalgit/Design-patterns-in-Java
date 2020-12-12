package com.designpatterns.strategy.duck.behaviors.Impl;

import com.designpatterns.strategy.duck.behaviors.QuackBehavior;

/**
 * created by saurabhgupta on 12/12/20
 */
public class QuackQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("The duck quacks");
    }
}
