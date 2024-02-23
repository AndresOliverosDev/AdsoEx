package Academy.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import Academy.main.models.Customer;

@Service
public interface CustomerService {

    List<Customer> getAll();

    Customer getById(Integer id);

    Customer addCustomer(Customer customer);
    
    Customer updateCustomer(Integer id,Customer customer);

    void dellCustomer(Integer id);
}
