package bank.dao;

import bank.domain.Borrowing;
import bank.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomer extends JpaRepository<Customer, Long> {
}
