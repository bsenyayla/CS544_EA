package bank.dao;

import bank.domain.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowing extends JpaRepository<Borrowing, Long> {
}
