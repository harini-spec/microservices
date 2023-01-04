package io.harini.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.harini.models.Ratings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {

		@RequestMapping("{id}")
		public Ratings getRatings(@PathVariable("id") String movieId) {
			return new Ratings(movieId,5);
		}
	
}
