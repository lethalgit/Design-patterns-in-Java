package com.designpatterns.factory.ElectricityBillPlan;

import com.designpatterns.factory.ElectricityBillPlan.plans.CommercialPlan;
import com.designpatterns.factory.ElectricityBillPlan.plans.DomesticPlan;
import com.designpatterns.factory.ElectricityBillPlan.plans.InstitutionalPlan;
import com.designpatterns.factory.ElectricityBillPlan.plans.Plan;

/**
 * created by saurabhgupta on 21/12/20
 */
public class ElectricityBillFactory {
    public Plan getPlan(PlanEnum plan) {
        switch (plan) {
            case DOMESTIC:
                return new DomesticPlan();
            case COMMERCIAL:
                return new CommercialPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
        }
        return null;
    }
}
