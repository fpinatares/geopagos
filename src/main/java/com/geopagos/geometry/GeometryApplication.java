package com.geopagos.geometry;

import com.geopagos.geometry.repository.IFigureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = IFigureRepository.class)
@SpringBootApplication
public class GeometryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeometryApplication.class, args);
	}

}
