package com.yacine.tuto;

public class NotificationManagerService {
    private final NotificationService notificationService;

    public NotificationManagerService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void Notification(String message){
        notificationService.Send(message);
    }
}
