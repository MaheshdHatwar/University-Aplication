package com.cricket.mode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CricketPlayers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "RunScored")
	private double runscored;
	@Column(name = "PlayerType")
	private String playerType;
	public CricketPlayers(int id, double runscored, String playerType) {
		super();
		this.id = (long) id;
		this.runscored = runscored;
		this.playerType = playerType;
	}
	public CricketPlayers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "cricketPlayers [id=" + id + ", runscored=" + runscored + ", playerType=" + playerType + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id2) {
		this.id = id2;
	}
	public double getRunscored() {
		return runscored;
	}
	public void setRunscored(double runscored) {
		this.runscored = runscored;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
}
