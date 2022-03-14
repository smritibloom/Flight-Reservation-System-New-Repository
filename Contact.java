package com.company;

public class Contact {

    private String name;
    private int phoneNumber;
    private String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactDetails(){
        return "Name: "+this.name+", Phone Number: "+this.phoneNumber+", Email-Id: "+this.emailId;
    }
    public void updateContactDetails(String contactDetail){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailId=emailId;
    }

    public Contact(String name,int phoneNumber,String emailId){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailId=emailId;
    }
}
