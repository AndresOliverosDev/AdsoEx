package Academy.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Academy.main.models.Customer;
import Academy.main.services.CustomerService;

@RestController
public class CustomerController{

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @GetMapping("/getCustomerById")
    public Customer getCustomerById(Long id) {
        return customerService.getById(id);
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Long id, Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

@DeleteMapping("/deleteCustomer")
public ResponseEntity<String> deleteCustomer(Long id) {
    try {
        customerService.dellCustomer(id);
            return ResponseEntity.ok("Cliente con ID " + id + " eliminado correctamente");
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo encontrar el cliente con ID " + id);
    }
}

}; 