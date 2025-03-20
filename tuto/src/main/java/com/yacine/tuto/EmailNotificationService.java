package com.yacine.tuto;

public class EmailNotificationService implements NotificationService {
    public void Send(String message){
System.out.println("Vous recevez un " + message + " par email");
    }
}
