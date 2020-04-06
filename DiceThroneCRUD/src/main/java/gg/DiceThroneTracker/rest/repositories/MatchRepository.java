package gg.DiceThroneTracker.rest.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import gg.DiceThroneTracker.rest.domain.Match;

public interface MatchRepository extends JpaRepository<Match, Long>{

}
