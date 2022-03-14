package com.company;

public class Address {

    String street;
    String city;
    String state;

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
