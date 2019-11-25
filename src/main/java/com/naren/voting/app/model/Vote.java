package com.naren.voting.app.model;

import java.util.Date;

public class Vote {
	private Long id;
	private String vote;
	Date time;

	public Vote() {
	}

	public Vote(Long id, String vote) {
		super();
		this.id = id;
		this.vote = vote;
		this.time = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
