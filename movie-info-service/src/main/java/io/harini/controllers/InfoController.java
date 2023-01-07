package io.harini.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.harini.models.InfoItem;

@RestController
@RequestMapping("/movies")
public class InfoController {
	
	@RequestMapping("{id}")
	public InfoItem getInfo(@PathVariable("id") String movieId){

		return new InfoItem(movieId,"Avenger");
	}

}
