package com.herokuapp.kirtanadarabal.restaurantreservationapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.herokuapp.kirtanadarabal.restaurantreservationapi.models.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	
	public long count();
	public List<Restaurant> findByName(String name);
	public Optional<Restaurant> findById(Long Id);

}
