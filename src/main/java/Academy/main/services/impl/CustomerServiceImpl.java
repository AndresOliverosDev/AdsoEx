package Academy.main.services.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Academy.main.models.Customer;
import Academy.main.repositories.CustomerRepository;
import Academy.main.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    };

    @SuppressWarnings("null")
    @Override
    public Customer getById(Integer id) {
    return customerRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Customer not found with id: " + id));
    };

    @SuppressWarnings("null")
    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    };

    @SuppressWarnings("null")
    @Override
    public Customer updateCustomer(Integer id, Customer customer) {
        Customer customerBBDD = customerRepository.findById(id).orElse(null);

        if(customerBBDD != null){
            customerBBDD.setFullName(customer.getFullName());
            customerBBDD.setLastName(customer.getLastName());
            customerBBDD.setNumberPhone(customer.getNumberPhone());
            customerBBDD.setAddress(customer.getAddress());
            return customerRepository.save(customerBBDD);
        }
        return null;
    };

    @SuppressWarnings("null")
    @Override
    public void dellCustomer(Integer id) {
        customerRepository.deleteById(id);
    };
};
