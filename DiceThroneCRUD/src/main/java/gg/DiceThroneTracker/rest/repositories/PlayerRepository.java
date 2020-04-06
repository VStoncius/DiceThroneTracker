package gg.DiceThroneTracker.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gg.DiceThroneTracker.rest.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

	Player findByName(String name);

}
