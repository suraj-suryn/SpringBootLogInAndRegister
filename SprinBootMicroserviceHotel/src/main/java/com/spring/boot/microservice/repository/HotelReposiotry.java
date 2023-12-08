package com.spring.boot.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.microservice.entity.Hotel;

public interface HotelReposiotry extends JpaRepository<Hotel, String> {

	Hotel getHotelByHotelId(String hotelId);

}
