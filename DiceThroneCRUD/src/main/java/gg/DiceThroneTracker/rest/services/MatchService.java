package gg.DiceThroneTracker.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gg.DiceThroneTracker.rest.domain.Match;
import gg.DiceThroneTracker.rest.repositories.MatchRepository;


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
