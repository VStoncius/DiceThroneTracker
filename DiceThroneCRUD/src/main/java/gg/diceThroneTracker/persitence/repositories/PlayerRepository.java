package gg.diceThroneTracker.persitence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gg.diceThroneTracker.persitence.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

	Player findByName(String name);

}
