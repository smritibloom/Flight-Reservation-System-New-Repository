package com.company;

public class RegularTicket extends Ticket {

    private String specialServices;
    private String availedService;

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    public String getAvailedService() {
        return availedService;
    }

    public void setAvailedService(String availedService) {
        this.availedService = availedService;
    }

    public String checkAvailedServices(){
        return specialServices;
    }
    public String getSpecialServicesDetails(){
        return specialServices;
    }
    public void updateSpecialServices(String specialService){
        this.specialServices=specialService;
    }

    public RegularTicket(int pnrNumber,String departureLocation,String arrivalLocation,String departureDate,String departureTime,String arrivalDate,String arrivalTime,String journeyDuration,String seatNumber, float ticketPrice,boolean confirmation,boolean ticketCancel,String specialServices, String availedService){
        super(pnrNumber,departureLocation,arrivalLocation,departureDate,departureTime,arrivalDate,arrivalTime,journeyDuration,seatNumber,ticketPrice,confirmation,ticketCancel);
        this.specialServices=specialServices;
        this.availedService=availedService;
    }
}
