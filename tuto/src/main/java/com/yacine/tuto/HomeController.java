package com.yacine.tuto;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/Controller")
    public String Test() {
        return "Ceci est mon controlleur HTML";
    }

}