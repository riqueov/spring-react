package com.springreact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	
}
