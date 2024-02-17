package Academy.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Academy.main.model.Customers;

interface CustomersRepository extends JpaRepository<Customers, Long> {

};