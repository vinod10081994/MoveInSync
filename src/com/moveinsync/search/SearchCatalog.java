package com.moveinsync.search;

import java.util.HashMap;
import java.util.List;

import com.moveinsync.movie.Movie;

interface catalogue{
	
	HashMap<String,List<Movie>> loadCityMovie();
	
	List<Movie> searchMovies(String city);
}

public class SearchCatalog implements catalogue {
	
	
	 HashMap<String,List<Movie>> mapCityMovie;
	public SearchCatalog() {
		 
	}

	@Override
	public HashMap<String, List<Movie>> loadCityMovie() {
		// need to code
		HashMap<String,List<Movie>> temp=new HashMap<String,List<Movie>>();
		mapCityMovie=temp;
		return mapCityMovie;
		
		
	}

	@Override
	public List<Movie> searchMovies(String city) {
		List<Movie> movies=this.mapCityMovie.get(city);
		
			return movies;
	}

	
}
