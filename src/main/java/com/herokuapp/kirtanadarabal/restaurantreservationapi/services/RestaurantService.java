package com.herokuapp.kirtanadarabal.restaurantreservationapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.kirtanadarabal.restaurantreservationapi.models.Restaurant;
import com.herokuapp.kirtanadarabal.restaurantreservationapi.repositories.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public List<Restaurant> getAllRestaurants(){
		List<Restaurant> restaurants = new ArrayList<>(); 
		for (Restaurant restaurant: restaurantRepository.findAll()) {
			restaurants.add(restaurant);
		}
		return restaurants;
	}
	
	public Long countOfAllRestaurants() {
		return restaurantRepository.count();
	}
	
	public void addRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

}
