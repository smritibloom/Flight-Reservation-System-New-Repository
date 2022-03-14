package com.company;

public class Location {

    String touristLocation;

    public String getTouristLocationDetails(){
        return touristLocation;
    }

    public void updateTouristLocationDetails(String touristLocationDetail){
        this.touristLocation=touristLocation;
    }

    public Location(String touristLocation){
        this.touristLocation=touristLocation;
    }
}
