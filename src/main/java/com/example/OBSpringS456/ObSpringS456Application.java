package com.example.OBSpringS456;

import com.example.OBSpringS456.entidades.LaptopEntidad;
import com.example.OBSpringS456.entidades.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringS456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringS456Application.class, args);

		LaptopRepository laptop =context.getBean(LaptopRepository.class);


		LaptopEntidad laptop1 =new LaptopEntidad(null, "Dell" , "55asS", true);
		LaptopEntidad laptop2 =new LaptopEntidad(null, "Apple" , "Macbook Air", true);

		laptop.save(laptop1);
		laptop.save(laptop2);

		System.out.println(" La lista de laptops son: " + laptop.findAll());
	}

}
