package case_study.bai_1.service.all_class_service;

import case_study.bai_1.model.Customer;
import case_study.bai_1.repository.all_repo_class.CustomerRepository;
import case_study.bai_1.repository.all_repo_interface.ICustomerRepository;
import case_study.bai_1.service.all_service_interface.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
    private static ICustomerRepository repository = new CustomerRepository();

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add(Object object) {
        repository.add(object);
    }

    @Override
    public void edit(String customerId, Customer customer) {
        repository.edit(customerId, customer);
    }

    @Override
    public Customer findByCustomerId(String customerId) {
        return repository.findByCustomerId(customerId);
    }

}
