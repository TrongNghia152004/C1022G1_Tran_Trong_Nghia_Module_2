package case_study.bai_1.repository.all_repo_class;

import case_study.bai_1.data.all_rw_class.RWEmployee;
import case_study.bai_1.model.Employee;
import case_study.bai_1.repository.all_repo_interface.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void display() {
        employeeList = RWEmployee.readCSVEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Object object) {
        employeeList.clear();
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
                RWEmployee.writeCSVEmployee2(employeeList);
            }
        }
    }

    @Override
    public void edit(Employee employee) {
        employeeList = RWEmployee.readCSVEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employee.getEmployeeId())) {
                employeeList.set(i, employee);
                RWEmployee.writeCSVEmployee2(employeeList);
            }
        }
    }

    @Override
    public Employee findById(String employeeId) {
        employeeList = RWEmployee.readCSVEmployee();
        for (int i=0; i< employeeList.size();i++) {
            if (employeeList.get(i).getEmployeeId().equals(employeeId)) {
                return employeeList.get(i);
            }
        }
        return null;
    }
}
