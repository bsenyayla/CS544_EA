package bank.service;

import bank.dao.ICustomer;
import bank.domain.Customer;
import bank.domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppDriverService {
    @Autowired
    CustomerService customerBS;

    public void initialApp(){
        Customer c1=new Customer("Customer1", "cust1@mail.com");
        Reservation rv1=new Reservation(1, new Date()) ;
        Reservation rv2=new Reservation(2, new Date()) ;
        Reservation rv3=new Reservation(3, new Date()) ;

        c1.AddReservation(rv1);
        c1.AddReservation(rv2);
        c1.AddReservation(rv3);




        customerBS.CreateCustomer(c1);
        customerBS.CreateCustomer(new Customer("Customer2", "cust2@mail.com"));
        customerBS.CreateCustomer(new Customer("Customer3", "cust3@mail.com"));
        customerBS.CreateCustomer(new Customer("Customer4", "cust4@mail.com"));



    }
}
