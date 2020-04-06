package gg.diceThroneTracker.persitence.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gg.diceThroneTracker.api.rest.PlayerService;
import gg.diceThroneTracker.persitence.domain.Player;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/players")
@Api (value = "players")
public class PlayerController {

	@Autowired
	private PlayerService service;
	
	@GetMapping("/all")
	@ApiOperation(value="Get all players",notes="Returns all registered players")
	public List<Player> listAll() {
		return service.retrieveAllPlayers();
	}

	
	@PostMapping("/post")
	@ApiOperation(value="post",notes="post")
	@Transactional
	public ResponseEntity<String> createNewPlayer(@RequestBody Player player) {
		if (service.findPlayerByName(player.getName())==null) { //creates a new template entity ONLY if there are no templates on the database
		service.createNewPlayer(player);
		return new ResponseEntity<String>("Saved succesfully", HttpStatus.CREATED);
		}
		else 
		return new ResponseEntity<String>("Failed to create user", HttpStatus.CONFLICT);
	}
	
}
