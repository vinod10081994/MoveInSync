package com.moveinsync.driver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.moveinsync.cinemall.CinemaHall;
import com.moveinsync.cinemall.Seat;
import com.moveinsync.cinemall.ShowTimings;
import com.moveinsync.movie.Movie;
import com.moveinsync.search.SearchCatalog;

public class DriverClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in)); 
		SearchCatalog sc=new SearchCatalog();
		String city;
		System.out.println("Please enter city name");
		city=br.readLine();
		List<Movie> movies=sc.searchMovies(city);
		int i=1,choose;
		System.out.println("Enter the number to select a movie");
		for(Movie temp : movies) {
            System.out.println(i+"."+temp.getName());
            i++;
        }
		choose=Integer.parseInt(br.readLine());
		Movie movie=movies.get(choose);
		
		List<CinemaHall> cinemaHalls=movie.getCinemaHall();
		i=1;
		System.out.println("Enter the number to select a CinemaHall");
		for(CinemaHall temp :cinemaHalls) {
            System.out.println(i+"."+temp.getName());
            i++;
        }
		choose=Integer.parseInt(br.readLine());
		CinemaHall cinemaHall=cinemaHalls.get(choose);
		
		List<ShowTimings> showTimings=cinemaHall.getShowTimings();
		i=1;
		System.out.println("Enter the number to select a ShowTimings");
		for(ShowTimings temp :showTimings) {
            System.out.println(i+"."+temp.startTime+" to "+temp.endTime);
            i++;
        }
		choose=Integer.parseInt(br.readLine());
		ShowTimings showTiming=showTimings.get(i);
		
		List<Seat> seats=showTiming.seats;
		i=1;
		System.out.println("Enter the number to select a SeatNumber");
		for(Seat temp :seats) {
            System.out.println(i+"."+temp.row+temp.column));
            i++;
        }
		
		choose=Integer.parseInt(br.readLine());
		Seat seat=seats.get(choose);
		
		
	}

}
