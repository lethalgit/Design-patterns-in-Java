package com.designpatterns.factory.ElectricityBillPlan;

/**
 * created by saurabhgupta on 21/12/20
 */
public class Main {
    public static void main(String[] args) {
        ElectricityBillFactory electricityBillFactory = new ElectricityBillFactory();
        Plan plan = electricityBillFactory.getPlan(PlanEnum.COMMERCIAL);
        System.out.println(plan.getRate());
        System.out.println(plan.calculateBill(4));
    }
}
