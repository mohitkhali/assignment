package com.data.crud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.crud.service.userService;

@RestController
public class userController {

	@Autowired
	userService userService;
	
	@PostMapping("/entercandidate")
	public String saveByName(@RequestParam("name")String name) {
		
		userService.saveName(name);
		
		return "saved";
		
	}

	
	
	@GetMapping("/castvote")
	public Integer castvote(@RequestParam("name")String name) {
		
		int latestcount =userService.casteCount(name);
		
		return latestcount;
		
	}
	
	@GetMapping("/countvote")
	public Integer countvote(@RequestParam("name")String name) {
		
		int latestcount =userService.latestCount(name);
		
		return latestcount;
		
	}
	
	@GetMapping("/listvote")
	public Map<String,Integer> showAllData(){
	
		return userService.getAll();
	}
	
	
	@GetMapping("/getwinner")
	public String getWinner() {
	
		return userService.getWinner();
	}
	
	
	
}
