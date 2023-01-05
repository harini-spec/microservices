package io.harini.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.harini.models.CatalogItem;
import io.harini.models.InfoItem;
import io.harini.models.UserRatings;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public List<CatalogItem> getDetails(@PathVariable("id") String userId){
		
		// get all movie ids
		UserRatings ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/"+userId, UserRatings.class);
		
		// get movie name and details for each movie id
		return ratings.getUserRatings().stream().map(rating -> {
			InfoItem movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieID(),InfoItem.class);
			
		// Put them all together
			return new CatalogItem(movie.getMovieName(), "Goood", rating.getRating());
		})
		.collect(Collectors.toList());                     // to convert the result after iteration into a list
	}

}
