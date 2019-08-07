package com.herokuapp.kirtanadarabal.restaurantreservationapi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestaurantReservationApiApplication {

	@Bean
	public Map<String, Object> getMapStringObject() {
		return new HashMap<String, Object>();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RestaurantReservationApiApplication.class, args);
	}

}
