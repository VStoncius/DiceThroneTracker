package gg.diceThroneTracker.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gg.diceThroneTracker.persitence.domain.Match;
import gg.diceThroneTracker.persitence.repositories.MatchRepository;


//Logic goes here!!!!
@Service
public class MatchService {
	@Autowired
	private MatchRepository matchRepository;

	
	public List<Match> retrieveAllMatches() {
		return matchRepository.findAll();
	}
	
	public Match createNewMatch(Match playerEntity) {
		return matchRepository.save(playerEntity);
	}
}
