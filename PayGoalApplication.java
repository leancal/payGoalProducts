package com.leandro.project.payGoal;

import com.leandro.project.payGoal.models.Product;
import com.leandro.project.payGoal.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PayGoalApplication {



	public static void main(String[] args) {
		SpringApplication.run(PayGoalApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(ProductRepository productRepository) {
		return args -> {

			Product producto1 = new Product(1, "Camara", "Camara de fotos", 100.0, 6);
			Product producto2 = new Product(2, "Celular", "Celular de alta gama", 200.0, 12);

			productRepository.save(producto1);
			productRepository.save(producto2);
		};
	}

}
