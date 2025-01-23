package com.yacine.tuto;

import org.springframework.stereotype.Component;

@Component
public class BonjourService {
    public String direBonjour() {
        return "Bonjour du Bean ! 👋";
    }
}