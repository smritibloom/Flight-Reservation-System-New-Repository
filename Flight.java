package com.company;

public class Flight {

    String flightNumber;
    String flightAirline;
    int flightCapacity;
    boolean flightAvailability;
    int currentSeatAvailable;
    int numberOfSeatBooking;

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
