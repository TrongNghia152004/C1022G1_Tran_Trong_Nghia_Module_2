package case_study.bai_1.model;

public class Employee extends Person {
    private String employeeId;
    private String level;
    private String position;
    private String wage;

    public Employee(String employeeId, String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String level, String position, String wage) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                "name='" + super.getName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", identityCard='" + super.getIdentityCard() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", level='" + this.level + '\'' +
                ", position='" + this.position + '\'' +
                ", wage='" + this.wage + '\'' +
                '}';
    }

    public String formatCSVEmployee() {
        final String COMMA = ",";
        return this.employeeId + COMMA + super.convertLine() + COMMA + this.level + COMMA + this.position + COMMA + wage;
    }
}