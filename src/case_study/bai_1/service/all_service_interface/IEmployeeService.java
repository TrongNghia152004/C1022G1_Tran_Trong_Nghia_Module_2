package case_study.bai_1.service.all_service_interface;

import case_study.bai_1.model.Employee;
import case_study.bai_1.service.IService;

public interface IEmployeeService extends IService {

    void delete(String employeeId);

    void edit(Employee employee);

    Employee findById(String employeeId);
}
