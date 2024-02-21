package Academy.main.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Customers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    @Id
    public Integer ced;
    public String fullName;
    public String lastName;
    public Integer numberPhone;
    public String address;
};
