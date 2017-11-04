package com.ferlodev.ninjabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.ferlodev.ninjabackend.*")
@SpringBootApplication
public class NinjabackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjabackendApplication.class, args);
	}
}
