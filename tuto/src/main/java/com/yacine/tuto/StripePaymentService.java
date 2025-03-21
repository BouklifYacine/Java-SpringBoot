package com.yacine.tuto;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("Prix " + amount);
    }
}
