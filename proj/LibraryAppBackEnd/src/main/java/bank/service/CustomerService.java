package bank.service;

import bank.dao.ICustomer;
import bank.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    ICustomer customerDAO;



    public void CreateCustomer(String customerName, String email) {
        Customer cs=new Customer(customerName,email);
        customerDAO.save(cs);

        /*
        logger.log("deposit with parameters accountNumber= " + accountNumber
                + " , amount= " + amount);
        if (amount > 10000) {
            jmsSender.sendJMSMessage("Deposit of $ " + amount
                    + " to account with accountNumber= " + accountNumber);
        }

        */
    }

    public void CreateCustomer(Customer csVal) {

        customerDAO.save(csVal);

        /*
        logger.log("deposit with parameters accountNumber= " + accountNumber
                + " , amount= " + amount);
        if (amount > 10000) {
            jmsSender.sendJMSMessage("Deposit of $ " + amount
                    + " to account with accountNumber= " + accountNumber);
        }

        */
    }
}
