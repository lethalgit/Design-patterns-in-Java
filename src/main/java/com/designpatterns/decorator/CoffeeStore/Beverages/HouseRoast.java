package com.designpatterns.decorator.CoffeeStore.Beverages;

/**
 * created by saurabhgupta on 17/12/20
 */
public class HouseRoast extends Beverage{
    @Override
    public String description() {
        return "HouseRoast";
    }

    @Override
    public Double cost() {
        return 11.0;
    }
}
