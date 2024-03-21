package com.coderhouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.Entities.Client;
import com.coderhouse.repository.ClientRepository;
import com.coderhouse.repository.ProductRepository;

@SpringBootApplication
public class EcommerceApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		System.out.println("EJECUTADO");
	}
	


}
