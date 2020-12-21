package com.designpatterns.factory.ElectricityBillPlan;

/**
 * created by saurabhgupta on 21/12/20
 */
public abstract class Plan {
    public double rate;
    abstract double getRate();
    public double calculateBill(int units) {
        return units*rate;
    }
}
