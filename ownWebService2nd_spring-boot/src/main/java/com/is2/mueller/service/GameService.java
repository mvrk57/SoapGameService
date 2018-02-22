package com.is2.mueller.service;

import com.is2.mueller.model.Game;

public interface GameService {

	void addGames();
	Game findGame(String title);
}

