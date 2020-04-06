package gg.DiceThroneTracker.TransferData;


public class MatchInfo {

	private String player1;

	private String player2;

	private String character1;

	private String character2;

	private String winner;

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
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

	public MatchInfo(String player1, String player2, String character1, String character2, String winner) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.character1 = character1;
		this.character2 = character2;
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "MatchInfo [player1=" + player1 + ", player2=" + player2 + ", character1=" + character1 + ", character2="
				+ character2 + ", winner=" + winner + "]";
	}

	
}
