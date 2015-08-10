package facade1;

public class TripPlannerFacade {
	
	private Airline airline = new Airline();
	private Hotel hotel = new Hotel();
	private SafariRide safari = new SafariRide();
	
	public void planTrip() {
		System.out.println("Création du voyage");
		airline.bookTicket();
		hotel.bookRoom();
		safari.buyTickets();
	}
	
	public void cancelTrip() {
		System.out.println("Annulation du voyage");
		airline.cancelTicket();
		hotel.cancelRoom();
		safari.cancelTickets();
	}
	
}
