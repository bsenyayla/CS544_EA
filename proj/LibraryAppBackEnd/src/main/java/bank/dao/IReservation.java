package bank.dao;

import bank.domain.Customer;
import bank.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservation extends JpaRepository<Reservation, Long> {
}
