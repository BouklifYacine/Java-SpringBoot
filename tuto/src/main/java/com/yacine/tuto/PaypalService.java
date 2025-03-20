package com.yacine.tuto;

import org.springframework.stereotype.Service;

@Service
public class PaypalService implements PaymentService {
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount" + amount);
            }
}
