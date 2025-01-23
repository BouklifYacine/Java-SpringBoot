package com.yacine.tuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BonjourController {

    private final BonjourService bonjourService; 
    private final BeanTest beanTest;

    @Autowired 
    public BonjourController(BonjourService bonjourService, BeanTest beanTest) {
        this.bonjourService = bonjourService;
        this.beanTest = beanTest;
    }

    

    @GetMapping("/bonjour") 
    public String afficherBonjour() {
        return bonjourService.direBonjour() + " " + beanTest.BeanTest(); // Utilise le bean
    }
}