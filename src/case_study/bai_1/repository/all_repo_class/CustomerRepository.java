package case_study.bai_1.repository.all_repo_class;

import case_study.bai_1.data.all_rw_class.RWCustomer;
import case_study.bai_1.data.all_rw_class.RWEmployee;
import case_study.bai_1.model.Customer;
import case_study.bai_1.repository.all_repo_interface.ICustomerRepository;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new LinkedList<>();

    @Override
    public void display() {
        customerList = RWCustomer.readCSVCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Object object) {
        customerList.clear();
        Customer customer = (Customer) object;
        customerList.add(customer);
        RWCustomer.writeCSVCustomer(customerList);
    }

    @Override
    public void edit(Customer customer) {
        customerList = RWCustomer.readCSVCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(customer.getCustomerId())) {
                customerList.set(i, customer);
                RWCustomer.writeCSVCustomer2(customerList);
            }
        }
    }

    @Override
    public Customer findByCustomerId(String customerId) {
        customerList = RWCustomer.readCSVCustomer();
        for (int i = 0 ; i < customerList.size() ; i++) {
            if (customerList.get(i).getCustomerId().equals(customerId)) {
                return customerList.get(i);
            }
        }
        return null;
    }
}
