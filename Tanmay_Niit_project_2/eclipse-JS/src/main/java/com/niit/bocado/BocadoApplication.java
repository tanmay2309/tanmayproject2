package com.niit.bocado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages= {"com.niit"})
@EntityScan(basePackages= {"com.niit.bocado.model"})

public class BocadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BocadoApplication.class, args);
	}

}
