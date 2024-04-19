package com.co.bonilla.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiciosParcialCrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServiciosParcialCrudApplication.class, args);
	}

}
