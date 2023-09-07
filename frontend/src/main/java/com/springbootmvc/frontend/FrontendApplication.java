package com.springbootmvc.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}
	
	@Bean("rt")
	public RestTemplate getRestTemplate()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}

}
