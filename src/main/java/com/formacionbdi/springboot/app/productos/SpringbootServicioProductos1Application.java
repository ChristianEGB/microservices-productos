package com.formacionbdi.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioProductos1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProductos1Application.class, args);
	}

}
