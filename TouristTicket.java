package com.company;

public class TouristTicket extends Ticket{

    private String hotelAddress;
    private String touristLocation;

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String touristLocation) {
        this.touristLocation = touristLocation;
    }

    public String getHotelAddressDetails(){
        return hotelAddress;
    }
    public String getTouristLocationDetails(){
        return touristLocation;
    }

    public TouristTicket(int pnrNumber,String departureLocation,String arrivalLocation,String departureDate,String departureTime,String arrivalDate,String arrivalTime,String journeyDuration,String seatNumber, float ticketPrice,boolean confirmation,boolean ticketCancel,String hotelAddress,String touristLocation){
        super(pnrNumber,departureLocation,arrivalLocation,departureDate,departureTime,arrivalDate,arrivalTime,journeyDuration,seatNumber,ticketPrice,confirmation,ticketCancel);
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
    }
}
