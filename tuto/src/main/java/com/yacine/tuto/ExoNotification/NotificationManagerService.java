package com.yacine.tuto.ExoNotification;

public class NotificationManagerService {
    private NotificationService notificationService;

    public NotificationManagerService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void Notification(){
        notificationService.Send("Test du service");
    }
}
