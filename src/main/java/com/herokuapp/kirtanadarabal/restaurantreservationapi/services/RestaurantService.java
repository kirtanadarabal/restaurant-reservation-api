package com.herokuapp.kirtanadarabal.restaurantreservationapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	//optional may or may not contain null values
	public Optional<Restaurant> getRestaurant(Long id) {
		return restaurantRepository.findById(id);
	}
	
	public void addRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}
	
	public void updateRestaurant(Long id, Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}
	
	public void removeRestaurant(Long id) {
		restaurantRepository.deleteById(id);
	}

}
