package com.is2.mueller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.is2.mueller.service.GameService;

//import com.mkyong.service.HibernateSearchService;

public class GameController {

    //@Autowired
    //private HibernateSearchService searchservice;

    @Autowired
    private GameService gameservice;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void init() {
    	gameservice.addGames();
    }
	
	
}
