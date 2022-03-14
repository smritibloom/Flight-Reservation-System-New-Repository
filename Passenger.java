package com.company;

public class Passenger {

    private int registrationId;
    private String passengerName;
    private double passengerPhoneNumber;
    private String passengerEmail;
    private String addressStreet;
    private String addressCity;
    private String addressState;

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public double getPassengerPhoneNumber() {
        return passengerPhoneNumber;
    }

    public void setPassengerPhoneNumber(double passengerPhoneNumber) {
        this.passengerPhoneNumber = passengerPhoneNumber;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

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
