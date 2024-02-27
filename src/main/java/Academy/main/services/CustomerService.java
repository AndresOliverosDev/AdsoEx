package Academy.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import Academy.main.models.Customer;

@Service
public interface CustomerService {

    List<Customer> getAll();

    Customer getById(Long id);

    Customer addCustomer(Customer customer);
    
    Customer updateCustomer(Long id,Customer customer);

    void dellCustomer(Long id);
}
