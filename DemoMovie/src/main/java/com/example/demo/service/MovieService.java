package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Movie;

public interface MovieService {

	void add(Movie m);
	List<Movie> display();
}
