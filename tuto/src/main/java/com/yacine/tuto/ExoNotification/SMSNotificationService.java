package com.yacine.tuto.ExoNotification;

public class SMSNotificationService implements NotificationService {
    @Override
    public void Send(String message){
        System.out.println("Envoi de SMS : " + message);
    }
}
