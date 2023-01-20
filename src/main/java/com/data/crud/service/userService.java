package com.data.crud.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class userService {
	
	HashMap<String, Integer> map = new HashMap<>();
	public void saveName(String name) {
		
		if(map.containsKey(name))
			map.put(name, map.get(name)+1);
		else
		map.put(name,1);
		
	}

	public int casteCount(String name) {
	
		if(map.containsKey(name)) {
			map.put(name, map.get(name)+1);
			return map.get(name);
			
		}
		
	return 0;
		
	}
	public int latestCount(String name) {
		
		if(map.containsKey(name)) {
			
			return map.get(name);
			
		}
		
	return 0;
		
	}

	public Map<String, Integer> getAll() {
		// TODO Auto-generated method stub
		return map;
	}

	public String getWinner() {
		
		if(map.size()>0) {
		int max = Collections.max(map.values());
		
		
		for(String key : map.keySet()) {
			if(map.get(key)==max)
				return key;
		}
		}
		
		return "no values present";
	}
	

}
