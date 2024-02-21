package Academy.main.services;

import java.util.List;

import Academy.main.models.Customer;

public interface CustomerService {

    List<Customer> getAll();

    Customer getById(Integer id);

    Customer addCustomer(Customer customer);
    
    Customer updateCustomer(Integer id,Customer customer);

    void dellCustomer(Integer id);
}
