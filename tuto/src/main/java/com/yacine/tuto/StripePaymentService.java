package com.yacine.tuto;

import org.springframework.stereotype.Service;
@Service("stripe")
public class StripePaymentService implements PaymentService {
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("Prix " + amount);
    }
}
