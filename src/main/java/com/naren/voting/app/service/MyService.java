package com.naren.voting.app.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.naren.voting.app.model.Vote;

@Component
public class MyService {
	private List<Vote> votes = new ArrayList<Vote>();
	private static Long COUNTER = 0l;

	public void addClick(String vote) {
		votes.add(new Vote(COUNTER++, vote));
	}

	public Collection<Vote> geClicks() {
		return votes;

	}

}
