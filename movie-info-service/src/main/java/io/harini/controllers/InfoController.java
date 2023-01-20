package io.harini.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.harini.models.InfoItem;
import io.harini.models.MovieDetails;

@RestController
@RequestMapping("/movies")
public class InfoController {
	
	@Value("${api-key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("{id}")
	public InfoItem getInfo(@PathVariable("id") String movieId){
		
		MovieDetails details = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieDetails.class);
		
		return new InfoItem(movieId, details.getTitle(), details.getOverview());  
		// model gets only the required values from the response using the json dict id value

		// return new InfoItem(movieId,"Avenger");
	}

}
