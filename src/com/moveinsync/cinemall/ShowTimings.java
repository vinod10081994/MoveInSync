package com.moveinsync.cinemall;

import java.util.Date;
import java.util.List;

public class ShowTimings {
	
	public Date startTime;
	public Date endTime;
	public List<Seat> seats;
	 
	public ShowTimings(Date startTime,Date endTime,List<Seat> seats) {
		this.startTime=startTime;
		this.endTime=endTime;
		this.seats=seats;
	}

}
