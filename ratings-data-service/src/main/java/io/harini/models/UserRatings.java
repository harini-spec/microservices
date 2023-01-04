package io.harini.models;

import java.util.List;

public class UserRatings {
	
	private List<Ratings> UserRatings;
	
	public UserRatings() {}

	public UserRatings(List<Ratings> userRatings) {
		super();
		UserRatings = userRatings;
	}

	public List<Ratings> getUserRatings() {
		return UserRatings;
	}

	public void setUserRatings(List<Ratings> userRatings) {
		UserRatings = userRatings;
	}
	

}
