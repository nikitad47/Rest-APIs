package com.example.Movies.Repository;

import com.example.Movies.Entity.MovieCatalog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieCatalog,Long>{

}
