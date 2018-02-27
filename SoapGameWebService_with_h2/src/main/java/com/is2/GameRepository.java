package com.is2;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.data.repository.CrudRepository;

import com.example.is2.Game;

@Component
public class GameRepository implements CrudRepository<Game,String> {
	
	/*private static final Map<String, Game> games = new HashMap<String, Game>();
		
	
		public Game findGame(String name) {
			Assert.notNull(name, "The game's name must not be null");
			return games.get(name);
		}
*/
		@Override
		public <S extends Game> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Game> Iterable<S> save(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public void delete(Game entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Iterable<? extends Game> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Game findOne(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean exists(String id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterable<Game> findAll(Iterable<String> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void delete(String id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Iterable<Game> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
	
}
