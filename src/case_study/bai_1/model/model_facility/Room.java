package case_study.bai_1.model.model_facility;

import case_study.bai_1.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceCode ,String serviceName, String usableArea, String rentalCosts, String maxNumberOfPeople, String rentalType, String freeService) {
        super(serviceCode ,serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceCode='" + super.getServiceCode() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", usableArea='" + super.getUsableArea() + '\'' +
                ", rentalCosts='" + super.getRentalCosts() + '\'' +
                ", maxNumberOfPeople='" + super.getMaxNumberOfPeople() + '\'' +
                ", rentalType='" + super.getRentalType() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String formatCSVRoom(){
        final String COMMA = ",";
        return super.convertLine2() + COMMA + this.freeService;
    }
}
