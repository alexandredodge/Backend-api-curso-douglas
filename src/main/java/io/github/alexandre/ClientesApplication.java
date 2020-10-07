package io.github.alexandre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import io.github.alexandre.model.entidades.Cliente;

@SpringBootApplication
@RestController
public class ClientesApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
