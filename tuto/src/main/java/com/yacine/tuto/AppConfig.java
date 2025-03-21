package com.yacine.tuto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${ChoixNotif}")
    private String ChoixNotif;

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
        if (ChoixNotif.equals("SMS")) {
            return new NotificationManagerService(SMS());
        }
        return new NotificationManagerService(Email());
    }
}
