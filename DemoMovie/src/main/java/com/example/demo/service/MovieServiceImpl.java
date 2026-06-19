package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@Service

public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository mr;
	
	@Override
	public void add(Movie m) {
		// TODO Auto-generated method stub
			mr.save(m);

	}

	@Override
	public List<Movie> display() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

}
