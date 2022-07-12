package bank.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import bank.domain.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountDAO extends JpaRepository<Account, Long> {

}
