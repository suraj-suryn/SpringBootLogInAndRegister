package com.spring.boot.microservice.service;

import java.util.List;

import com.spring.boot.microservice.entity.Hotel;

public interface HotelServices {

	Hotel create(Hotel hotel);
	List<Hotel> getAllHotel();
	Hotel getHotel(String id);
	Hotel getHotelByHotelId(String hotelId);
}
