package com.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info (title = "Spring Security"))
@SpringBootApplication
public class SpringSecurityJwtJava17SpringBoot3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtJava17SpringBoot3Application.class, args);
	}

}
