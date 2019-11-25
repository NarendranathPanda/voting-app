package com.naren.voting.app.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naren.voting.app.model.Vote;
import com.naren.voting.app.service.MyService;

@RestController()

public class VotingRestController {

	MyService service = new MyService();

	@GetMapping("rest/votes/{vote}")
	public String vote(@PathVariable String vote) {
		service.addClick(vote);
		return "You voted: " + vote;
	}

	@GetMapping("rest/votes")
	public Collection<Vote> getVotes() {
		return service.geClicks();
	}
}
