package application.Service;

import application.Integration.TaxIntegration;
import com.fasterxml.jackson.core.JsonProcessingException;
import application.Integration.jms.AccountEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    TaxIntegration taxIntegration;

    public void deposit(AccountEntry accEntry) throws JsonProcessingException {
        if(accEntry.getAmount()> 1000){
            taxIntegration.PutMessageToQueue(accEntry);
        }
    }


}
