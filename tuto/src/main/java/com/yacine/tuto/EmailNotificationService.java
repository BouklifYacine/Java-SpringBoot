package com.yacine.tuto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// @Service("Email")
// @Primary
public class EmailNotificationService implements NotificationService {

    @Value("${stripe.apiurl}")
    private String apiURL;
    @Value("${stripe.enabled}")
    private boolean enabled;

    @Override
    public void Send(String message) {
        System.out.println("Envoi d'email " + message);
        System.out.println(apiURL);
        System.out.println(enabled);
    }
}
