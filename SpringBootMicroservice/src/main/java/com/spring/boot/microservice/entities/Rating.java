package com.spring.boot.microservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rating {

	@Id
	@Column(name = "RatingId")
	private String ratingId;
	@Column(name = "UserId")
	private String userId;
	@Column(name = "HotelId")
	private String hotelId;
	@Column(name = "Rating")
	private String rating;
	@Column(name = "FeedBack", length = 50)
	private String feedback;
}
