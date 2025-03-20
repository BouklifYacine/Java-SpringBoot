package com.yacine.tuto;


import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void PlaceOrder() {

        paymentService.processPayment(10);
    }

}
