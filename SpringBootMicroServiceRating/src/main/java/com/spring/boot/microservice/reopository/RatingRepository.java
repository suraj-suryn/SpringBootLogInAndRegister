package com.spring.boot.microservice.reopository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.boot.microservice.entity.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

	List<Rating> findByHotelId(String hotelId);

	List<Rating> findByRatingId(String ratingId);

	List<Rating> findByUserId(String userId);

}
