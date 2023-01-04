package io.harini.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.harini.models.CatalogItem;
import io.harini.models.Ratings;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	@GetMapping("/{id}")
	public List<CatalogItem> getDetails(@PathVariable("id") String userId){
		
		// get all movie ids
		
		List<Ratings> ratings = Arrays.asList(new Ratings("1234",4), new Ratings("5678",3));
		
		// get movie name and details for each movie 
		
		return ratings.stream().map(rating -> new CatalogItem("Alice in Wonderland", "Goood", 5)).collect(Collectors.toList()); 
		// to convert the result after iteration into a list
		
		// put them all together
	}

}
