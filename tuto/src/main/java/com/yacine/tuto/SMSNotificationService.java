package com.yacine.tuto;

public class SMSNotificationService implements NotificationService {
    @Override
    public void Send(String message){
        System.out.println("Envoi de SMS : " + message);
    }
}
