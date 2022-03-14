package com.company;

public class Passenger {

    int registrationId;
    String passengerName;
    double passengerPhoneNumber;
    String passengerEmail;
    String addressStreet;
    String addressCity;
    String addressState;

    public int getRegistrationId(){
        return registrationId;
    }
    public String getContactDetails(){
        return "Passenger Name: "+this.passengerName+", Passenger PhoneNumber: "+this.passengerPhoneNumber+", Passenger Email-ID: "+this.passengerEmail;
    }
    public String getAddressDetails(){
        return "Passenger Address: "+this.addressStreet+", "+this.addressCity+", "+this.addressState;
    }
    public void updateContactDetails(String contactDetail){
        this.passengerName=passengerName;
        this.passengerPhoneNumber=passengerPhoneNumber;
        this.passengerEmail=passengerEmail;
    }
    public void updateAddressDetails(String addressDetail){
        this.addressStreet=addressStreet;
        this.addressCity=addressCity;
        this.addressState=addressState;
    }

    public Passenger(int registrationId,String passengerName,double passengerPhoneNumber,String passengerEmail,String addressStreet,String addressCity,String addressState){
        this.registrationId=registrationId;
        this.passengerName=passengerName;
        this.passengerPhoneNumber=passengerPhoneNumber;
        this.passengerEmail=passengerEmail;
        this.addressStreet=addressStreet;
        this.addressCity=addressCity;
        this.addressState=addressState;
    }
}
