package com.is2.mueller.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.util.Assert;

import com.is2.mueller.model.Game;

public interface GameRepository extends CrudRepository<Game,Long> {

	
}