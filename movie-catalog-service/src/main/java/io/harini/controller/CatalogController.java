package io.harini.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.harini.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	@GetMapping("/{id}")
	public List<CatalogItem> getDetails(@PathVariable("id") String userId){
		return Collections.singletonList(
				new CatalogItem("Alice in Wonderland", "Goood", 5)
				);
	}

}
