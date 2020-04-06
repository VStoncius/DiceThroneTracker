package gg.diceThroneTracker.persitence.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Match implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;


	@ManyToOne
	private Player player1;

	@ManyToOne
	private Player player2;
	
	@Column
	private String character1;
	
	@Column
	private String character2;
	
	@Column
	private String winner;
	
	public Match() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public String getCharacter1() {
		return character1;
	}

	public void setCharacter1(String character1) {
		this.character1 = character1;
	}

	public String getCharacter2() {
		return character2;
	}

	public void setCharacter2(String character2) {
		this.character2 = character2;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public Match(Long id, Player player1, Player player2, String character1, String character2, String winner) {
		super();
		this.id = id;
		this.player1 = player1;
		this.player2 = player2;
		this.character1 = character1;
		this.character2 = character2;
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Match [id=" + id + ", player1=" + player1 + ", player2=" + player2 + ", character1=" + character1
				+ ", character2=" + character2 + ", winner=" + winner + "]";
	}
	
	
	
}
