package com.moveinsync.movie;

import java.util.List;

import com.moveinsync.cinemall.CinemaHall;

public class Movie {
	
	private String name;
	private List<CinemaHall> cinemaHall;
	
	public Movie(String name,List<CinemaHall> cinemaHall) {
		
		this.name=name;
		this.cinemaHall=cinemaHall;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CinemaHall> getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(List<CinemaHall> cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	

}