package com.yacine.tuto;

public class OrderService {
   public void PlaceOrder(){
    StripePaymentService compte = new StripePaymentService();
    compte.processPayment(10);
   }

}
