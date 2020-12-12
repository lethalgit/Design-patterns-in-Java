package com.designpatterns.strategy.payment.Impl;

import com.designpatterns.strategy.payment.PaymentStrategy;

/**
 * created by saurabhgupta on 12/12/20
 */
public class NetBakingStrategy implements PaymentStrategy {
    final private String userName;
    final private String password;

    public NetBakingStrategy(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void payTheAmount(int amount) {
        System.out.println("Amount - " + amount + " has been deducted using net baking.");
    }
}
