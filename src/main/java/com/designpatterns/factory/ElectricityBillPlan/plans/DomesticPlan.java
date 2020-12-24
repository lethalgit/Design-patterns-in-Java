package com.designpatterns.factory.ElectricityBillPlan.plans;

/**
 * created by saurabhgupta on 21/12/20
 */
public class DomesticPlan extends Plan{
    @Override
    public double getRate() {
        rate = 3.5;
        return rate;
    }
}
