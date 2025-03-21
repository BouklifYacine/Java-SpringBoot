package com.yacine.tuto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

// @Service("stripe")
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiurl}")
    private String apiURL;
    @Value("${stripe.enabled}")
    private boolean enabled;

    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("Prix " + amount);
        System.out.println(apiURL);
        System.out.println(enabled);
    }
}
