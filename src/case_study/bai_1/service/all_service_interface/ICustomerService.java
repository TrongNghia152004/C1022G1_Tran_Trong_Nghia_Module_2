package case_study.bai_1.service.all_service_interface;

import case_study.bai_1.model.Customer;
import case_study.bai_1.service.IService;

public interface ICustomerService extends IService {
    void edit(Customer customer);

    Customer findByCustomerId(String customerId);
}
