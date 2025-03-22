package com.yacine.tuto;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private String tester = "salut";

    @Bean
    public NotificationService SMS() {
        return new SMSNotificationService();
    }

    @Bean
    public NotificationService Email() {
        return new EmailNotificationService();
    }

    @Bean
    public NotificationManagerService notificationManagerService() {
        if (tester.equals("salut")) {
            return new NotificationManagerService(SMS());
        }
        return new NotificationManagerService(Email());
    }
}
