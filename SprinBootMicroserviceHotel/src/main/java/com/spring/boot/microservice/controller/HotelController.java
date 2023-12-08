package com.spring.boot.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.microservice.entity.Hotel;
import com.spring.boot.microservice.service.HotelServices;

@RestController
@RequestMapping("/hotel")
public class HotelController {


	@Autowired
	private HotelServices hotelServices;
	
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.create(hotel));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.getAllHotel());
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelByHotelId(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.getHotelByHotelId(hotelId));	
	}
	
	
	
}
