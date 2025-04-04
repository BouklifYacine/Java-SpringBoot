package com.yacine.tuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.yacine.tuto.entities.User;

@SpringBootApplication
public class TutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoApplication.class, args);
		User.builder()
		.name("yacine").email("Tg@live.fr").build();
		

	}

}
