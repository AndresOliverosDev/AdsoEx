package Academy.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Academy.main.model.Customer;

@RestController
public class CustomerController {

    @PostMapping("/customers")
    public Customer consult(Integer ced,String fullname, String lastname,Integer numberPhone,String address) {
        return new Customer(123,fullname,lastname,numberPhone,address);
    };
};