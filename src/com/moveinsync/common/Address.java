package com.moveinsync.common;

public class Address {
	
	private String city;
	private String street;
	private String plotno;
	
	public Address(String city,String street,String plotno) {
		
		this.city=city;
		this.street=street;
		this.plotno=plotno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPlotno() {
		return plotno;
	}

	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
      
}
