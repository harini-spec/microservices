package io.harini.models;

public class Ratings {
	
	private String movieID;
	private int rating;
	
	public Ratings() {}
	
	public Ratings(String movieID, int rating) {
		super();
		this.movieID = movieID;
		this.rating = rating;
	}
	
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	

}
