package com.designpatterns.decorator.CoffeeStore.Beverages;

/**
 * created by saurabhgupta on 17/12/20
 */
public class Americano extends Beverage{
    @Override
    public String description() {
        return "Americano";
    }

    @Override
    public Double cost() {
        return 10.0;
    }
}
