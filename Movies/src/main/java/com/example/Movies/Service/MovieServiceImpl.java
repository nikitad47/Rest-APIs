package com.example.Movies.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Entity.MovieCatalog;
import com.example.Movies.Exception.MovieException;
import com.example.Movies.Repository.MovieRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository repo;

	@Override
	public MovieCatalog getMovieById(Long id) {
		Optional<MovieCatalog> byId = this.repo.findById(id);
		
		if(byId.isPresent())
		{
			return byId.get();
		}
		else
		{
			throw new MovieException("Movie Not Found");
		}
	}

	

	@Override
	public List<MovieCatalog> save(List<MovieCatalog> m) {
		return repo.saveAll(m);
	}

	@Override
	public List<MovieCatalog> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
