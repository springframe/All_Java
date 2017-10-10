package com.nt.beans;

public class TravelAgent {
	
	private TourPlan tp;

	public TravelAgent() 
	{
	System.out.println("TravelAgent:0-param constructor");
	}

	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent:1-paramContructor");
		this.tp = tp;
	}

	
	//setter and getter
	
	
	public void setTp(TourPlan tp) {
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + "]";
	}
	
	
	
}
