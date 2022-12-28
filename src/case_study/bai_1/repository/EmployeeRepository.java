package case_study.bai_1.repository;

import case_study.bai_1.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("1", "Nghĩa", "01/05/2004", "Nam", "123456789",
                "89175813", "ttn.hdttb152004@gmail.com", "12/12", "giám đốc", "5 tỷ/ tuần"));
        employeeList.add(new Employee("2", "Trường", "29/02/1998", "Nam", "22222222",
                "89175231", "ttn.hdttb@gmail.com", "Đại học", "lễ tân", "1tr/ tháng"));
        employeeList.add(new Employee("3", "Quân", "31/12/1997", "Nam", "33333333",
                "89172313", "ttn.hdttb15@gmail.com", "12/12", "phục vụ", "2tr/ tháng"));
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Object object) {
        Employee employee = (Employee) object;
        employeeList.add(employee);
    }

    @Override
    public void delete(String employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employeeId)) {
                employeeList.remove(employeeList.get(i));
            }
        }
    }

    @Override
    public void edit(String employeeId, Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employee.getEmployeeId())) {
                employeeList.set(i, employee);
                break;
            }
        }
    }


    @Override
    public Employee findById(String employeeId) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }
}
