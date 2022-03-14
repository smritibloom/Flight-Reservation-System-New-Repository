package com.company;

public class Ticket {

    private int pnrNumber;
    private String departureLocation;
    private String arrivalLocation;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private String journeyDuration;
    private String seatNumber;
    private float ticketPrice;
    private boolean confirmation;
    private boolean ticketCancel;


    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getJourneyDuration() {
        return journeyDuration;
    }

    public void setJourneyDuration(String journeyDuration) {
        this.journeyDuration = journeyDuration;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public boolean isTicketCancel() {
        return ticketCancel;
    }

    public void setTicketCancel(boolean ticketCancel) {
        this.ticketCancel = ticketCancel;
    }

    public String getTicketDetails(){
        return "PNR number: "+this.pnrNumber+", Departure Location: "+this.departureLocation+", Arrival Location: "+this.arrivalLocation+", Departure Date and Time: "+this.departureDate+this.departureTime+", Arrival Date and Time: "+this.arrivalDate+this.arrivalTime+", Duration of Journey: "+this.journeyDuration+", Seat Number: "+this.seatNumber+", Price of Ticket: "+this.ticketPrice;
    }
    public void updateTicketDetails(String ticketDetails){
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
