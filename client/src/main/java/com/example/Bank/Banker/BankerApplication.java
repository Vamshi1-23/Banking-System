  package com.example.Bank.Banker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.Bank.Banker.model.serviceimpl.BankServiceimpl;

@SpringBootApplication
public class BankerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankerApplication.class, args);
		System.out.println("done");
	}

	@Bean
	public RestTemplate resttemplate() {
		return new RestTemplate();
	}

	@Bean
	public BankServiceimpl bankserviceimpl() {
		return new BankServiceimpl();
	}

}
