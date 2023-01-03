package case_study.bai_1.repository.all_repo_class;

import case_study.bai_1.data.all_rw_class.RWCustomer;
import case_study.bai_1.model.Customer;
import case_study.bai_1.repository.all_repo_interface.ICustomerRepository;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new LinkedList<>();

//    static {
//        customerList.add(new Customer("1", "Nghĩa", "12/01/2004", "Nam", "1234567890"
//                , "0898175813", "ttn@gmail.com", "Diamon", "k03/10 Triệu Vân"));
//        customerList.add(new Customer("2", "Trọng", "15/03/2004", "Nam", "1234472940"
//                , "0474812232", "hahaha@gmail.com", "Gold", "k03/10 Triệu Vân"));
//        customerList.add(new Customer("3", "Trọng", "17/05/2004", "Nam", "4242494888"
//                , "0384294722", "hdttb@gmail.com", "Silver", "k03/10 Triệu Vân"));
//    }

    @Override
    public void display() {
        customerList = RWCustomer.readCSVCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Object object) {
        Customer customer = (Customer) object;
        customerList.add(customer);
        RWCustomer.writeCSVCustomer(customerList);
    }

    @Override
    public void edit(String customerId, Customer customer) {
        customerList = RWCustomer.readCSVCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(customerId)) {
                customerList.set(i, customer);
                RWCustomer.writeCSVCustomer(customerList);
            }
        }
    }

    @Override
    public Customer findByCustomerId(String customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
