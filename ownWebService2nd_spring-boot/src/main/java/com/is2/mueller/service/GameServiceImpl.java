package com.is2.mueller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.is2.mueller.dao.GameRepository;
import com.is2.mueller.model.Game;

public class GameServiceImpl {
	
    @Autowired(required=true)
    GameRepository gamerepository;

    Game clashRoyal = new Game();
    Game tombRaider = new Game();
    Game monsterHunter = new Game();
    

    public void addGames() {
    	
    	clashRoyal.setTitle("Clash Royal");
    	clashRoyal.setReleasedate("2015");
    	clashRoyal.setRecommendedAge(0);
    	clashRoyal.setPrice(10);
    	clashRoyal.setGenre("SmartPhone");
    	    	
    	gamerepository.save(clashRoyal);
    	
    	tombRaider.setTitle("Tomb Raider");
    	tombRaider.setReleasedate("1995");
    	tombRaider.setRecommendedAge(16);
    	tombRaider.setPrice(40);
    	tombRaider.setGenre("Adventure");

        gamerepository.save(tombRaider);
     
        monsterHunter.setTitle("Monster Hunter");
        monsterHunter.setReleasedate("2018");
        monsterHunter.setRecommendedAge(16);
        monsterHunter.setPrice(60);
        monsterHunter.setGenre("MMORPG");

        gamerepository.save(monsterHunter);
        
        System.out.println("Games have been added : " + gamerepository.findAll());
    }
    
    public Game findGame(String title) {
    	Iterable<Game> results = gamerepository.findAll();
    	Game resultGame = new Game();
    	
    	for(Game s : results) {
    		if(s.getTitle().equals(title)) {
    			resultGame = s;
    		}
    	}
    		
    	return resultGame;
    }
}
