package com.company;

public class Contact {

    String name;
    int phoneNumber;
    String emailId;

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
