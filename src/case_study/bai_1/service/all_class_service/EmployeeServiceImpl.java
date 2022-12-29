package case_study.bai_1.service.all_class_service;

import case_study.bai_1.model.Employee;
import case_study.bai_1.repository.EmployeeRepository;
import case_study.bai_1.repository.IEmployeeRepository;
import case_study.bai_1.service.all_service_interface.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {
    private static IEmployeeRepository repository = new EmployeeRepository();

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add(Object object) {
        repository.add(object);
    }

    @Override
    public void delete(String employeeId) {
        repository.delete(employeeId);
    }

    @Override
    public void edit(String employeeId, Employee employee) {
        repository.edit(employeeId, employee);
    }


    @Override
    public Employee findById(String employeeId) {
        return repository.findById(employeeId);
    }
}