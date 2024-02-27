package Academy.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Academy.main.models.Customer;

// Stereotype Repository
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}