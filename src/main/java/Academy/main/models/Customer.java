package Academy.main.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Customers")
@Data

public class Customer {
    @Id
    public Integer ced;
    public String fullname;
    public String lastname;
    public Integer numberPhone;
    public String address;

    public Customer(Integer ced, String fullName, String lastName, Integer numberPhone, String address) {
        this.ced = ced;
        this.fullname = fullName;
        this.lastname = lastName;
        this.numberPhone = numberPhone;
        this.address = address;
    }
    public Customer() {
        
    }

    

};
