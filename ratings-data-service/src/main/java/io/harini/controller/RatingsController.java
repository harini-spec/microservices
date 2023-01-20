package io.harini.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.harini.models.Ratings;
import io.harini.models.UserRatings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
	
		@RequestMapping("{id}")
		public Ratings getRatings(@PathVariable("id") String movieId) {
			return new Ratings(movieId,5);
		}

		@RequestMapping("/user/{userid}")
		public UserRatings getUserRatings(@PathVariable("userid") String userid) {
			UserRatings userRating = new UserRatings();
			userRating.initData(userid);
			return userRating;
		}
	
}
