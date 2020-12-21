package com.designpatterns.factory.ElectricityBillPlan;

/**
 * created by saurabhgupta on 21/12/20
 */
public class InstitutionalPlan extends Plan{
    @Override
    double getRate() {
        rate = 4;
        return rate;
    }
}
