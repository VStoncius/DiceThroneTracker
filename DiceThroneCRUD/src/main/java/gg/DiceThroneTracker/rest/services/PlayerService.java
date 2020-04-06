package gg.DiceThroneTracker.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gg.DiceThroneTracker.rest.domain.Player;
import gg.DiceThroneTracker.rest.repositories.PlayerRepository;


//Logic goes here!!!!
@Service
public class PlayerService {
	@Autowired
	private PlayerRepository playerRepository;

	
	public List<Player> retrieveAllPlayers() {
		return playerRepository.findAll();
	}
	
	public Player createNewPlayer(Player playerEntity) {
		return playerRepository.save(playerEntity);
	}
	public Player findPlayerByName(String name) {
		return playerRepository.findByName(name);
	}
}
