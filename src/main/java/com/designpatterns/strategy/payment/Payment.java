package com.designpatterns.strategy.payment;

import com.designpatterns.strategy.payment.behaviors.PaymentStrategy;

/**
 * created by saurabhgupta on 12/12/20
 */
public class Payment {
    final private PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment(int amount) {
        paymentStrategy.payTheAmount(amount);
    }
}
