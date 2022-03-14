package com.company;

public class RegularTicket {

    String specialServices;
    String availedService;

    public String checkAvailedServices(){
        return specialServices;
    }
    public String getSpecialServicesDetails(){
        return specialServices;
    }
    public void updateSpecialServices(String specialService){
        this.specialServices=specialService;
    }

    public RegularTicket(String specialServices, String availedService){
        this.specialServices=specialServices;
        this.availedService=availedService;
    }
}
