package case_study.bai_1.model.model_facility;

import case_study.bai_1.model.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private String swimmingPoolArea;
    private String numberOfFloors;

    public Villa(String serviceCode , String serviceName, String usableArea, String rentalCosts, String maxNumberOfPeople, String rentalType, String roomStandard, String swimmingPoolArea, String numberOfFloors) {
        super(serviceCode ,serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceCode='" + super.getServiceCode() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", usableArea='" + super.getUsableArea() + '\'' +
                ", rentalCosts='" + super.getRentalCosts() + '\'' +
                ", maxNumberOfPeople='" + super.getMaxNumberOfPeople() + '\'' +
                ", rentalType='" + super.getRentalType() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea='" + swimmingPoolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
    public String formatCSVVilla(){
        final String COMMA = ",";
        return super.convertLine2() + COMMA +this.roomStandard + COMMA + this.swimmingPoolArea + COMMA + this.numberOfFloors;
    }
}
