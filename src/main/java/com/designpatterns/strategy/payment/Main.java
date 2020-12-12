package com.designpatterns.strategy.payment;

import com.designpatterns.strategy.payment.Impl.CardPaymentStrategy;

/**
 * created by saurabhgupta on 12/12/20
 */
public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment(new CardPaymentStrategy("username", 123));
        payment.doPayment(1000);
    }
}