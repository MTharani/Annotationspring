package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	public Vivo getPhone() {
		
		 return new Vivo();
		
	}
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragn();
	}

}
