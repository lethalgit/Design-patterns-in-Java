package com.designpatterns.strategy.duck.objects;

import com.designpatterns.strategy.duck.behaviors.Impl.FlyWithWings;
import com.designpatterns.strategy.duck.behaviors.Impl.QuackQuack;

/**
 * created by saurabhgupta on 12/12/20
 */
public class ForestDuck extends Duck{

    public ForestDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackQuack();
    }

    @Override
    public void display() {
        System.out.println("Forest duck looks fierce");
    }
}
