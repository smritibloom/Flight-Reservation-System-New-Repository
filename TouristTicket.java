package com.company;

public class TouristTicket {

    String hotelAddress;
    String touristLocation;

    public String getHotelAddressDetails(){
        return hotelAddress;
    }
    public String getTouristLocationDetails(){
        return touristLocation;
    }

    public TouristTicket(String hotelAddress,String touristLocation){
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
    }
}
