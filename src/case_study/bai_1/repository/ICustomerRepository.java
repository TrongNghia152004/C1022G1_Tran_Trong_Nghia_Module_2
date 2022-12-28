package case_study.bai_1.repository;

import case_study.bai_1.model.Customer;

public interface ICustomerRepository extends IRepository {
    void edit(String customerId, Customer customer);

    Customer findByCustomerId(String customerId);
}
