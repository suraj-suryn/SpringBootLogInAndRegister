package com.spring.boot.microservice.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.microservice.entity.Hotel;
import com.spring.boot.microservice.exception.ResouceNotFoundException;
import com.spring.boot.microservice.repository.HotelReposiotry;
import com.spring.boot.microservice.service.HotelServices;

@Service
public class HotelServiceImpl implements HotelServices {

	@Autowired
	private HotelReposiotry hotelReposiotry;

	@Override
	public Hotel create(Hotel hotel) {
		String uuid = UUID.randomUUID().toString();
		hotel.setId(uuid);
		int num = (int) hotelReposiotry.count();
		String hotelid = "Hotel_" + (num + 1);
		hotel.setHotelId(hotelid);
		return hotelReposiotry.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelReposiotry.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		return hotelReposiotry.findById(id)
				.orElseThrow(() -> new ResouceNotFoundException("Given hotel id not found : " + id));
	}

	@Override
	public Hotel getHotelByHotelId(String hotelId) {
		return hotelReposiotry.getHotelByHotelId(hotelId);
	}

}
