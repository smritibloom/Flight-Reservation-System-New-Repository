package com.company;

public class Ticket {

    int pnrNumber;
    String departureLocation;
    String arrivalLocation;
    String departureDate;
    String departureTime;
    String arrivalDate;
    String arrivalTime;
    String journeyDuration;
    String seatNumber;
    float ticketPrice;
    boolean confirmation;
    boolean ticketCancel;

    public String getTicketDetails(){
        return "PNR number: "+this.pnrNumber+", Departure Location: "+this.departureLocation+", Arrival Location: "+this.arrivalLocation+", Departure Date and Time: "+this.departureDate+this.departureTime+", Arrival Date and Time: "+this.arrivalDate+this.arrivalTime+", Duration of Journey: "+this.journeyDuration+", Seat Number: "+this.seatNumber+", Price of Ticket: "+this.ticketPrice;
    }
    public boolean getConfirmationStatus(){
        return confirmation;
    }
    public boolean getTicketCancel(){
        return ticketCancel;
    }

    public Ticket(int pnrNumber,String departureLocation,String arrivalLocation,String departureDate,String departureTime,String arrivalDate,String arrivalTime,String journeyDuration,String seatNumber, float ticketPrice,boolean confirmation,boolean ticketCancel){
        this.pnrNumber=pnrNumber;
        this.departureLocation=departureLocation;
        this.arrivalLocation=arrivalLocation;
        this.departureDate=departureDate;
        this.departureTime=departureTime;
        this.arrivalDate=arrivalDate;
        this.arrivalTime=arrivalTime;
        this.journeyDuration=journeyDuration;
        this.seatNumber=seatNumber;
        this.ticketPrice=ticketPrice;
        this.confirmation=true;
        this.ticketCancel=false;
    }
}
