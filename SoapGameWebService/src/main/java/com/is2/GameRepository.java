package com.is2;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.example.is2.Game;

@Component
public class GameRepository {
	
	private static final Map<String, Game> games = new HashMap<String, Game>();
		
		@PostConstruct
		public void initData() {
			Game clashRoyal = new Game();
			
			clashRoyal.setTitle("Clash Royal");
			clashRoyal.setGenre("Smartphone");
			clashRoyal.setPrice(10);
			clashRoyal.setRecommendedAge(0);
			clashRoyal.setReleasedate("2015");
			
			games.put(clashRoyal.getTitle(), clashRoyal);
	
		/*	Game illguth = new Employee();
			illguth.setName("Illguth");
			illguth.setVorname("Martin");
			illguth.setAlter(38);
			illguth.setBeruf("Softwareentwickler");;
			illguth.setJahresgehalt(60000);
			games.put(illguth.getName(), illguth);
	
			Game mueller = new Employee();
			mueller.setName("Müller");
			mueller.setVorname("Manuel");
			mueller.setAlter(25);
			mueller.setBeruf("Consultant");;
			mueller.setJahresgehalt(40000);
			games.put(mueller.getName(), mueller);*/
	
		}
	
		public Game findGame(String name) {
			Assert.notNull(name, "The game's name must not be null");
			return games.get(name);
		}
	
}
