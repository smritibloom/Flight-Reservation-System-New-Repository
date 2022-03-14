package com.company;

public class Address {

    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddressDetails(){
        return "Street: "+this.street+", City: "+this.city+", State: "+this.state;
    }
    public void updateAddressDetails(String addressDetail){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public Address(String Street,String City,String State){
        this.street=street;
        this.city=city;
        this.state=state;
    }
}
