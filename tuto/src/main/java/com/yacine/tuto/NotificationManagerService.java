package com.yacine.tuto;

import org.springframework.stereotype.Service;

// @Service
public class NotificationManagerService {
    private final NotificationService notificationService;

    public NotificationManagerService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void Notification(String message){
        notificationService.Send(message);
    }
}
