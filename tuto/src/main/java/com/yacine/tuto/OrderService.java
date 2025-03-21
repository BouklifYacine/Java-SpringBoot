package com.yacine.tuto;

public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void PlacerOrder() {
        paymentService.processPayment(10);
    }
}
