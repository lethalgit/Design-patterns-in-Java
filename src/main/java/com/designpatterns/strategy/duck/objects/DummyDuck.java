package com.designpatterns.strategy.duck.objects;

import com.designpatterns.strategy.duck.behaviors.Impl.FlyNone;
import com.designpatterns.strategy.duck.behaviors.Impl.Squeak;

/**
 * created by saurabhgupta on 12/12/20
 */
public class DummyDuck extends Duck{

    public DummyDuck() {
        flyBehavior = new FlyNone();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("The dummy duck doesn't look real");
    }
}
