package case_study.bai_1.model;

import com.sun.org.apache.regexp.internal.RE;

public class Customer extends Person{
    private String customerId;
    private String typeOfGuest;
    private String address;

    public Customer( String customerId, String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeOfGuest, String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.customerId = customerId;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + this.customerId +
                "name='" + super.getName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", identityCard='" + super.getIdentityCard() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", typeOfGuest='" + this.typeOfGuest + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
    public String formatCustomer(){
        final String COMMA = ",";
        return this.customerId + COMMA + super.convertLine() + COMMA + this.typeOfGuest + COMMA + this.address;
    }
}
