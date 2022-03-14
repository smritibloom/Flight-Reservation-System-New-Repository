package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Flight flight= new Flight("6E123", "Domestic", 100,true,27,5 );
        Ticket ticket= new Ticket(78564392,"Delhi","Rajasthan","15/03/2022","10:30am","15/03/2022","1:30pm","3:00hour","27A", 4389,true,false);
        Passenger passenger= new Passenger(897654312,"Mack",1676543210,"b13mack@gmail.com","M.G.Road","Delhi","Delhi");
        RegularTicket regularTicket= new RegularTicket("Food , Water, Snacks","Snacks");
        TouristTicket touristTicket=new TouristTicket("Lemon Tree","Raipur");
        Address address=new Address("M.G.Road","Delhi","Delhi");
        Contact contact= new Contact("Mack",1676543210,"b13mack@gmail.com");
        Location location=new Location("Raipur");

        System.out.println("Flight Details: "+ flight.getFlightDetails()+ ",Flight Availability: "+ flight.isFlightAvailable()+", Current Seats Available: "+flight.getCurrentSeatAvailability()+", Number of Seat Booked: "+flight.getSeatBooked());
        System.out.println("Ticket Details: "+ticket.getTicketDetails()+", Ticket Confirmation: "+ticket.getConfirmationStatus()+", Ticket Cancellation: "+ticket.getTicketCancel());
        System.out.println("Passenger Details: Registration ID: "+passenger.getRegistrationId()+", Contact Details: "+passenger.getContactDetails()+", Address Details: "+passenger.getAddressDetails());
        System.out.println("For Regular Ticket: Special Services are: "+regularTicket.getSpecialServicesDetails()+", Service Availed: "+regularTicket.checkAvailedServices());
        System.out.println("For Tourist Ticket: Hotel Address: "+touristTicket.getHotelAddressDetails()+", Tourist Location Details: "+touristTicket.getTouristLocationDetails());
    }
}
