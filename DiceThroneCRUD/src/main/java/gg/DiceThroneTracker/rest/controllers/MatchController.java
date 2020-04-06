package gg.DiceThroneTracker.rest.controllers;

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

import gg.DiceThroneTracker.TransferData.MatchInfo;
import gg.DiceThroneTracker.rest.domain.Match;
import gg.DiceThroneTracker.rest.services.MatchService;
import gg.DiceThroneTracker.rest.services.PlayerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/matches")
@Api(value = "matches")
public class MatchController {

	@Autowired
	private MatchService service;
	private PlayerService playerService;

	@GetMapping("/allMatches")
	@ApiOperation(value = "Get all matches", notes = "Returns all registered matches")
	public List<Match> listAll() {
		return service.retrieveAllMatches();
	}

	@PostMapping("/save")
	@ApiOperation(value = "post", notes = "post")
	@Transactional
	public ResponseEntity<String> createNewMatch(@RequestBody MatchInfo matchInfo) {
		service.createNewMatch(new Match(null, playerService.findPlayerByName(matchInfo.getPlayer1()),
				playerService.findPlayerByName(matchInfo.getPlayer2()), matchInfo.getCharacter1(),
				matchInfo.getCharacter2(), matchInfo.getWinner()));
		return new ResponseEntity<String>("Saved succesfully", HttpStatus.CREATED);
	}

}
