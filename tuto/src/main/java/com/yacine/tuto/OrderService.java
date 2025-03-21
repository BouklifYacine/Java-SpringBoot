package com.yacine.tuto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service

public class OrderService {

    private PaymentService paymentService;
  
    public OrderService(@Qualifier("paypal") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void PlaceOrder() {
        paymentService.processPayment(10);
    }
}
