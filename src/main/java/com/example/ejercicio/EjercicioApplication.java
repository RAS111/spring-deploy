package com.example.ejercicio;

import com.example.ejercicio.entity.Laptop;
import com.example.ejercicio.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioApplication.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "laptop1", "LG");
		Laptop laptop2 = new Laptop(null, "laptop2", "HP");

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);

	}

}
