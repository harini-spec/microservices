package io.harini.models;

import java.util.Arrays;
import java.util.List;

public class UserRatings {
	
	private String userId;
	private List<Ratings> UserRatings;
	
	public UserRatings() {}

	public UserRatings(List<Ratings> userRatings) {
		super();
		UserRatings = userRatings;
	}
	
	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

	public List<Ratings> getUserRatings() {
		return UserRatings;
	}

	public void setUserRatings(List<Ratings> userRatings) {
		UserRatings = userRatings;
	}
	
	public void initData(String userId) {
		this.setUserId(userId);
		this.setUserRatings(Arrays.asList(
				new Ratings("100",4), 
				new Ratings("200",3)
				));
	}
	

}
