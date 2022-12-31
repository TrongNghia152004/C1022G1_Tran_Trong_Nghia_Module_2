package case_study.bai_1.repository.all_repo_class;

import case_study.bai_1.data.all_rw_class.RWEmployee;
import case_study.bai_1.model.Employee;
import case_study.bai_1.repository.all_repo_interface.IEmployeeRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {

    private static List<Employee> employeeList = new ArrayList<>();

//    static {
//        employeeList.add(new Employee("1", "Nghĩa", "01/05/2004", "Nam", "123456789",
//                "89175813", "ttn.hdttb152004@gmail.com", "12/12", "giám đốc", "5 tỷ/ tuần"));
//        employeeList.add(new Employee("2", "Trường", "29/02/1998", "Nam", "22222222",
//                "89175231", "ttn.hdttb@gmail.com", "Đại học", "lễ tân", "1tr/ tháng"));
//        employeeList.add(new Employee("3", "Quân", "31/12/1997", "Nam", "33333333",
//                "89172313", "ttn.hdttb15@gmail.com", "12/12", "phục vụ", "2tr/ tháng"));
//    }

    @Override
    public void display() {
        employeeList = RWEmployee.readCSVEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Object object) {
        Employee employee = (Employee) object;
        employeeList.add(employee);
        RWEmployee.writeCSVEmployee(employeeList);
    }

    @Override
    public void delete(String employeeId) {
        employeeList = RWEmployee.readCSVEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employeeId)) {
                employeeList.remove(employeeList.get(i));
                RWEmployee.writeCSVEmployee(employeeList);
            }
        }
    }

    @Override
    public void edit(String employeeId, Employee employee) {
        employeeList = RWEmployee.readCSVEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employee.getEmployeeId())) {
                employeeList.set(i, employee);
                RWEmployee.writeCSVEmployee(employeeList);
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
