package com.yacine.tuto;

import org.springframework.stereotype.Service;

// @Service("SMS")
public class SMSNotificationService implements NotificationService {
    @Override
    public void Send(String message){
        System.out.println("Envoi de SMS : " + message);
    }
}
