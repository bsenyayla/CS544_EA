package Service;

import Domain.AccountEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@EnableJms
public class BankService {
    @Autowired
    JmsTemplate jmsTemplate;

    public void deposit(AccountEntry accEntry){

        if(accEntry.getAmount()> 1000){


        }
    }

}


