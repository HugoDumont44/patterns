package org.test;

import facade1.TripPlannerFacade;

public class MainTestFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testTrip();
	}
	
	private static void testTrip(){
		TripPlannerFacade facade = new TripPlannerFacade();
		facade.planTrip();
		facade.cancelTrip();
	}
	
}
