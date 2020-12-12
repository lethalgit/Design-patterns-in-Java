package com.designpatterns.strategy.payment.Impl;

import com.designpatterns.strategy.payment.PaymentStrategy;

/**
 * created by saurabhgupta on 12/12/20
 */
public class CardPaymentStrategy implements PaymentStrategy {
    final private String CardNumber;
    final private int cvv;
    public CardPaymentStrategy(String cardNumber, int cvv) {
        this.CardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void payTheAmount(int amount) {
        System.out.println("Amount - " + amount + " has been deducted from the card");
    }
}
