package com.nt.serviceLocatory;

import java.util.HashMap;
import java.util.Map;

import com.nt.external.ScoreComp;
import com.nt.external.ScoreCompImpl;

public class scoreLocator
{
	
	
	public Map<String,ScoreComp> cache=new HashMap<>();
	
	public ScoreComp getSirvce( )
	{
		if(cache.containsKey("matchId"))
		{
			return cache.get("matchId");
			
		
		}
		else {
			ScoreComp scomp=new ScoreCompImpl();
			cache.put("matchId", scomp);
			return cache.get("matchId");
		}
		
	}

}
