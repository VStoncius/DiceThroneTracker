package gg.diceThroneTracker.persitence.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import gg.diceThroneTracker.persitence.domain.Match;

public interface MatchRepository extends JpaRepository<Match, Long>{

}
