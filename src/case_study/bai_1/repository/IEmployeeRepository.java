package case_study.bai_1.repository;

import case_study.bai_1.model.Employee;

public interface IEmployeeRepository extends IRepository {

    void delete(String employeeId);

    void edit(String employeeId, Employee employee);

    Employee findById(String employeeId);


}
