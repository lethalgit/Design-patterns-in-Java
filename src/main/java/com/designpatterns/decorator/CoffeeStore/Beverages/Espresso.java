package com.designpatterns.decorator.CoffeeStore.Beverages;

/**
 * created by saurabhgupta on 17/12/20
 */
public class Espresso extends Beverage{
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public Double cost() {
        return 8.0;
    }
}
