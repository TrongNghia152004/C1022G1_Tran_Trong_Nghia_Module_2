package case_study.bai_1.repository.all_repo_interface;

import case_study.bai_1.model.Employee;
import case_study.bai_1.repository.IRepository;

public interface IEmployeeRepository extends IRepository {

    void delete(String employeeId);

    void edit(Employee employee);

    Employee findById(String employeeId);


}
