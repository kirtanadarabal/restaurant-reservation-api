package com.herokuapp.kirtanadarabal.restaurantreservationapi.controllers;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.herokuapp.kirtanadarabal.restaurantreservationapi.models.Restaurant;
import com.herokuapp.kirtanadarabal.restaurantreservationapi.services.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private HashMap<String, Object> response;
	
	/* Retrieves the count and a list of all the restaurants */
	@RequestMapping(method=RequestMethod.GET, value="/restaurants")
	public ResponseEntity<Map<String, Object>> getAllRestaurants(){
		
		//retrieve all the restaurants from the database
		response.put("count", restaurantService.countOfAllRestaurants());
		response.put("restaurants", restaurantService.getAllRestaurants());
		
		//return status code 200 and JSON response
		return ResponseEntity.ok(response);
	}
	
	/* Retrieves a restaurant of a specific id, if restaurant not found returns null */
	@RequestMapping(method=RequestMethod.GET, value="/restaurants/{id}")
	public ResponseEntity<Optional<Restaurant>> getRestaurant(@PathVariable Long id) {
		
		return ResponseEntity.ok(restaurantService.getRestaurant(id));
	}
	
	/* Adds a restaurant to the database */
	@RequestMapping(method=RequestMethod.POST, value="/restaurants")
	public ResponseEntity<Void> addRestaurant(@RequestBody Restaurant restaurant) {
		
		//create new restaurant object and store in the database
		restaurantService.addRestaurant(restaurant);
		
		//the url of the newly created restaurant object 
		final URI location = ServletUriComponentsBuilder
	            .fromCurrentServletMapping().path("/restaurants/{id}").build()
	            .expand(restaurant.getId()).toUri();
		
		//return status code 201 and location of the object if successfully created 
		return ResponseEntity.created(location).build();	
	}
}
