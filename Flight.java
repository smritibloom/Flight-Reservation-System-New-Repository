package com.company;

public class Flight {

    private String flightNumber;
    private String flightAirline;
    private int flightCapacity;
    private boolean flightAvailability;
    private int currentSeatAvailable;
    private int numberOfSeatBooking;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public void setFlightAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public void setFlightCapacity(int flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    public boolean isFlightAvailability() {
        return flightAvailability;
    }

    public void setFlightAvailability(boolean flightAvailability) {
        this.flightAvailability = flightAvailability;
    }

    public int getCurrentSeatAvailable() {
        return currentSeatAvailable;
    }

    public void setCurrentSeatAvailable(int currentSeatAvailable) {
        this.currentSeatAvailable = currentSeatAvailable;
    }

    public int getNumberOfSeatBooking() {
        return numberOfSeatBooking;
    }

    public void setNumberOfSeatBooking(int numberOfSeatBooking) {
        this.numberOfSeatBooking = numberOfSeatBooking;
    }

    public String getFlightDetails(){
        return "Flight Number: "+this.flightNumber+", Airline: "+this.flightAirline+",Capacity: "+this.flightCapacity;
    }
    public void updateFlightDetails(String flightDetails){
        this.flightNumber=flightNumber;
        this.flightAirline=flightAirline;
        this.flightCapacity=flightCapacity;
    }
    public boolean isFlightAvailable(){
        return flightAvailability;
    }
    public void updateFlightAvailability(boolean flightAvailability){
        this.flightAvailability=true;

    }
    public int getCurrentSeatAvailability(){
        return currentSeatAvailable;
    }
    public void updateCurrentSeatAvailability(int currentSeatAvailable){
        this.currentSeatAvailable=currentSeatAvailable;
    }
    public int getSeatBooked(){
        return numberOfSeatBooking;
    }

    public Flight(String flightNumber,String flightAirline, int flightCapacity,boolean flightAvailability, int currentSeatAvailable,int numberOfSeatBooking){
        this.flightNumber=flightNumber;
        this.flightAirline=flightAirline;
        this.flightCapacity=flightCapacity;
        //this.flightDetails=flightDetails;
        this.flightAvailability=true;
        this.currentSeatAvailable=currentSeatAvailable;
        this.numberOfSeatBooking=numberOfSeatBooking;
    }
}
