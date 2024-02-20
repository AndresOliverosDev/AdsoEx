package Academy.main.model;

/* import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.stereotype.Controller;

@Controller */
public class Customer {
    public /*@Id @GeneratedValue(strategy = GenerationType.IDENTITY)*/ Integer ced;
    public String fullName;
    public String lastName;
    public Integer numberPhone;
    public String address;
    
    public Customer(Integer ced, String fullName, String lastName, Integer numberPhone, String address) {
        this.ced = ced;
        this.fullName = fullName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.address = address;
    };

};
