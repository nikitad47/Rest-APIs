package com.example.Movies.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Movies.Entity.MovieCatalog;
import com.example.Movies.Service.MovieService;


@RestController
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@PostMapping("/addmovies")
	public List<MovieCatalog> save(){
		List<MovieCatalog> list=new ArrayList<>();
		list.add(new MovieCatalog("Pathaan",180.0f));
		list.add(new MovieCatalog("Avatar 2",140.0f));
		list.add(new MovieCatalog("Hera Pheri",150.0f));
		list.add(new MovieCatalog("21st century Girl",100.0f));
		list.add(new MovieCatalog("RRR",200.0f));
		list.add(new MovieCatalog("Suryavanshi",150.0f));
		list.add(new MovieCatalog("KGF 1",200.0f));
		list.add(new MovieCatalog("KGF 2",300.0f));
		list.add(new MovieCatalog("Friends",200.0f));
		list.add(new MovieCatalog("Avengers",200.0f));
		list.add(new MovieCatalog("Harry Potter",300.0f));
		list.add(new MovieCatalog("Hit",90.0f));
		return service.save(list);
	}
	
	@GetMapping("/allmovies")
	public List<MovieCatalog> getallmovies()
	{
		return service.getAll();
	}
	
	@GetMapping("/movie/{id}")
	public MovieCatalog getMovieById(@PathVariable Long id)
	{
		return this.service.getMovieById(id);
	}
	
	@PostMapping("/buy/{id}")
	public String buyMovie(@PathVariable Long id)
	{
		return "Payment Successful";
	}

}
