package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService ms;
	
	@GetMapping("display")
	public List<Movie> displayMovies(){
		return ms.display();
		
	}
	
	@PostMapping("add")
	public void addMovie(Movie m) {
		ms.add(m);
	}
}
