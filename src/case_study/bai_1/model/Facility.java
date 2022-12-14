package case_study.bai_1.model;

import java.util.Date;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String maxNumberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode ,String serviceName, String usableArea, String rentalCosts, String maxNumberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(String maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maxNumberOfPeople='" + maxNumberOfPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String convertLine2(){
        final String COMMA = ",";
        return this.serviceCode + COMMA + this.serviceName + COMMA + this.usableArea + COMMA + this.rentalCosts
                + COMMA + this.maxNumberOfPeople + COMMA + this.rentalType;
    }
}
