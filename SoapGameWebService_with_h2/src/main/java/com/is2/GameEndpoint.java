package com.is2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.is2.Game;
import com.example.is2.GetGameInfoRequest;
import com.example.is2.GetGameInfoResponse;

@Endpoint
public class GameEndpoint {
	private static final String NAMESPACE_URI = "http://is2.example.com";

	private GameRepository gameRepository;

	@Autowired
	public GameEndpoint(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGameInfoRequest")
	@ResponsePayload
	public GetGameInfoResponse getGame(@RequestPayload GetGameInfoRequest request) {
		GetGameInfoResponse response = new GetGameInfoResponse();
		response.setGameInfo(gameRepository.findOne(request.getName()));//findGame(request.getName()));
		
		//System.out.println("suche in repo: "+ gameRepository.findGame(request.getName()) + "gesuchtes element: "+ request.getName() );
		System.out.println(response.getGameInfo() + " eingabe war: "+ request.getName());
		System.out.println("aus repo gefunden: "+ gameRepository.findOne("Clash Royal"));
		
		return response;
	}
	
	@PostConstruct
	public void initRepo() {
						
			Game clashRoyal = new Game();
			
			clashRoyal.setTitle("Clash Royal");
			clashRoyal.setId("Clash Royal");
			clashRoyal.setGenre("Smartphone");
			clashRoyal.setPrice(10);
			clashRoyal.setRecommendedAge(0);
			clashRoyal.setReleasedate("2015");
			System.out.println("GameEndpoint erzeugt");
			gameRepository.save(clashRoyal);
			System.out.println("aus repo gefunden: "+ gameRepository.findAll());
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
}
