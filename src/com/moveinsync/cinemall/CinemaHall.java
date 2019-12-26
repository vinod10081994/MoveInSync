package com.moveinsync.cinemall;

import java.util.List;

import com.moveinsync.common.Address;

public class CinemaHall {
	
	private String name;
	
	//private List<Seat>seats;
	
	private Address address;
	
	private List<ShowTimings> showTimings;
	
	public CinemaHall(String name,Address address,List<ShowTimings> showTimings) {
		
		this.name=name;
		
		this.address=address;
		this.showTimings=showTimings;
		
	}
	
	

	public List<ShowTimings> getShowTimings() {
		return showTimings;
	}



	/*public void setShowTimings(ShowTimings showTimings) {
		this.showTimings = showTimings;
	}*/



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
