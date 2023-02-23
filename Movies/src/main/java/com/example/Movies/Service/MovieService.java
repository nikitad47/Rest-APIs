package com.example.Movies.Service;

import java.util.List;

import com.example.Movies.Entity.MovieCatalog;


public interface MovieService {
	
	public MovieCatalog getMovieById(Long id);
	
	public List<MovieCatalog> getAll();
	
	public List<MovieCatalog> save(List<MovieCatalog> m);
 
}
