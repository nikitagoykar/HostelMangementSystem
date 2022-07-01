package com.SpringCore;

public class Player {
	
	private int playerId;
	private String PlayerName;
	private String Sport;
	
	public Player(int playerId, String playerName, String sport) {
		super();
		this.playerId = playerId;
		PlayerName = playerName;
		Sport = sport;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", PlayerName=" + PlayerName + ", Sport=" + Sport + "]";
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

}
