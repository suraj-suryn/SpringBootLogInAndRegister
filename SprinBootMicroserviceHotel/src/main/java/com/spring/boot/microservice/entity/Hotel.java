package com.spring.boot.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "HotelService")
public class Hotel {

	@Id
	@Column(name = "UUDI")
	private String id;
	@Column(name = "HotelId", unique = true)
	private String hotelId;
	@Column(name = "HotelName")
	private String name;
	@Column(name = "HotelLocation")
	private String location;
	@Column(name = "Description", length=50)
	private String about;

}
