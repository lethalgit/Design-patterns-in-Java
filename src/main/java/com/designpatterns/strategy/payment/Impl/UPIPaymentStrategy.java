package com.designpatterns.strategy.payment.Impl;

import com.designpatterns.strategy.payment.PaymentStrategy;

/**
 * created by saurabhgupta on 12/12/20
 */
public class UPIPaymentStrategy implements PaymentStrategy {
    final private int upiPin;

    public UPIPaymentStrategy(int upiPin) {
        this.upiPin = upiPin;
    }

    @Override
    public void payTheAmount(int amount) {
        System.out.println("Amount - " + amount + " has been deducted using UPI.");
    }
}
