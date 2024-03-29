package customers;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    Customer findByPhone(String phone);
    Customer findByEmail(String email);

    @Query("{email : :#{#email}}")
    Customer findCustomerWithEmail(@Param("email") String email);

    @Query("{'creditCard.type' : :#{#cctype}}")
    List<Customer>  findCustomerWithCreditCardType(@Param("cctype") String cctype);

}

