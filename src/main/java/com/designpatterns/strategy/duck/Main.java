package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.duck.objects.DummyDuck;
import com.designpatterns.strategy.duck.objects.ForestDuck;
import com.designpatterns.strategy.duck.objects.WoodenDuck;

/**
 * created by saurabhgupta on 12/12/20
 */
public class Main {

    public static void main(String[] args) {
        ForestDuck forestDuck = new ForestDuck();
        forestDuck.performFly();
        forestDuck.display();
        forestDuck.performQuack();
        DummyDuck dummyDuck = new DummyDuck();
        dummyDuck.performFly();
        dummyDuck.display();
        dummyDuck.performQuack();
        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.performFly();
        woodenDuck.display();
        woodenDuck.performQuack();
    }
}
