package com.yacine.tuto;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TutoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(TutoApplication.class, args);
	OrderService service1 = new OrderService(new StripePaymentService());
	service1.PlacerOrder();
		
	}

}
