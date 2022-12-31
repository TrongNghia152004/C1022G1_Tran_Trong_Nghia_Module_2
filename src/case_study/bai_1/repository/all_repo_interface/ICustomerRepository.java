package case_study.bai_1.repository.all_repo_interface;

import case_study.bai_1.model.Customer;
import case_study.bai_1.repository.IRepository;

public interface ICustomerRepository extends IRepository {
    void edit(String customerId, Customer customer);

    Customer findByCustomerId(String customerId);
}
