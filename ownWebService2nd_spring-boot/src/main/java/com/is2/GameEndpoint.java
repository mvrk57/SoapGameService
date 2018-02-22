package com.is2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.is2.mueller.model.GetGameInfoRequest;
import com.is2.mueller.model.GetGameInfoResponse;
import com.is2.mueller.service.GameService;

@Endpoint
public class GameEndpoint {

	private static final String NAMESPACE_URI = "http://is2.example.com";

    @Autowired
    private GameService gameservice;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
	@ResponsePayload
	public GetGameInfoResponse getGameInfoResponse(@RequestPayload GetGameInfoRequest request) {
		GetGameInfoResponse response = new GetGameInfoResponse();
		
		response.setGameInfo(gameservice.findGame(request.getName()));

		System.out.println(response.getGameInfo() + " eingabe war: "+ request.getName());
		
		return response;
	}
	
	
}
