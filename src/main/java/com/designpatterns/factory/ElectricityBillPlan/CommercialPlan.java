package com.designpatterns.factory.ElectricityBillPlan;

/**
 * created by saurabhgupta on 21/12/20
 */
public class CommercialPlan extends Plan{
    @Override
    double getRate() {
        rate = 5;
        return rate;
    }
}
