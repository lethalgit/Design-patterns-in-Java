package com.designpatterns.decorator.CoffeeStore.Condiments;

import com.designpatterns.decorator.CoffeeStore.Beverages.Beverage;

/**
 * created by saurabhgupta on 17/12/20
 */
public class Soy extends Condiment{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return "Enjoy " + this.beverage.description() + " with Soy";
    }

    @Override
    public Double cost() {
        return this.beverage.cost() + 4.0;
    }
}
