package com.spring.boot.microservice.service;

import java.util.List;

import com.spring.boot.microservice.entity.Rating;

public interface RatingService {

	Rating createRating(Rating rating);
	List<Rating> getAllRating();
	List<Rating> getRatingByRatingId(String ratingId);
	List<Rating> getRatingByHotelId(String hotelId);
	List<Rating> getRatingByUserId(String userId);
	}
