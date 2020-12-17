package com.designpatterns.decorator.CoffeeStore.Beverages;

/**
 * created by saurabhgupta on 17/12/20
 */
public class Decaf extends Beverage{
    @Override
    public String description() {
        return "Decaf";
    }

    @Override
    public Double cost() {
        return 12.0;
    }
}
