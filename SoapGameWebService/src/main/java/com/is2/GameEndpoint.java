package com.is2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

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
		response.setGameInfo(gameRepository.findGame(request.getName()));

		System.out.println("suche in repo: "+ gameRepository.findGame(request.getName()) + "gesuchtes element: "+ request.getName() );
		System.out.println(response.getGameInfo() + " eingabe war: "+ request.getName());
		
		
		return response;
	}
}
