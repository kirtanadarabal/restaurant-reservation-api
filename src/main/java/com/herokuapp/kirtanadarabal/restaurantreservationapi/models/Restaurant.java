package com.herokuapp.kirtanadarabal.restaurantreservationapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Restaurant {
	
	// Properties
	@Id @GeneratedValue
	private Long id;
	@NotNull
	private String name;
	@NotNull
	private String address;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@NotNull
	private String area;
	@NotNull
	private String postal_code;
	@NotNull
	private String country;
	@NotNull
	private String phone;
	@NotNull
	private double lat;
	@NotNull
	private double lng;
	@NotNull
	private int price;
	
	
	// Constructors
	public Restaurant() {
		
	}
	
	public Restaurant(Long id, String name, String address, String city, String state, String area, String postal_code,
			String country, String phone, double lat, double lng, int price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.area = area;
		this.postal_code = postal_code;
		this.country = country;
		this.phone = phone;
		this.lat = lat;
		this.lng = lng;
		this.price = price;
	}
	
	
	// Getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
