package com.yacine.tuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TutoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TutoApplication.class, args);
		NotificationManagerService notifmanager = context.getBean(NotificationManagerService.class);
		notifmanager.Notification("Coucou");


	}

}
