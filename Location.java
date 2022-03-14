package com.company;

public class Location {

    private String touristLocation;

    public String getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String touristLocation) {
        this.touristLocation = touristLocation;
    }

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
