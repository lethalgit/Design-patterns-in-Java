package com.designpatterns.decorator.CoffeeStore.Condiments;

import com.designpatterns.decorator.CoffeeStore.Beverages.Beverage;

/**
 * created by saurabhgupta on 17/12/20
 */
public abstract class Condiment extends Beverage {
    public abstract String description();
    public abstract Double cost();
}
