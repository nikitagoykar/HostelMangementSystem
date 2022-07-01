package com.constuctor;

public class Player {
private String playerName;
private String sport;
private int age;

public Player(String playerName, String sport, int age) {
	super();
	this.playerName = playerName;
	this.sport = sport;
	this.age = age;
}

@Override
public String toString() {
	return "Player [playerName=" + playerName + ", sport=" + sport + ", age=" + age + "]";
}

public Player() {
	super();
	// TODO Auto-generated constructor stub
}

}
