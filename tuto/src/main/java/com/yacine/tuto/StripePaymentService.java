package com.yacine.tuto;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("Prix" + amount);
    }
}
