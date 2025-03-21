package com.yacine.tuto.ExoNotification;

public class EmailNotificationService implements NotificationService {
    @Override
        public void Send(String message){
        System.out.println("Envoi d'email " + message);
    }
}
