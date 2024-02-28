package Academy.main.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Data

public class Customer {

    @Id
    @Getter
    @Setter
    @Column
    public Long ced;

    @Getter
    @Setter
    @Column
    public String fullname;


    @Getter
    @Setter
    @Column
    public String lastname;

    @Getter
    @Setter
    @Column
    public Long phone;

    @Getter
    @Setter
    @Column
    public String address;
};
