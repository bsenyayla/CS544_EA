package app.Customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    //log için sadece bu yeterli consola yada dosyaya yazmak için config den değiştirmek gerekli
    Logger logger= LoggerFactory.getLogger(CustomerService.class);


    public  void DoSomething(){
        logger.info("Customer Service --> info");
        System.out.println("CustomerService...");
    }
}


/*
    Logger logger = LoggerFactory.getLogger(CustomerService.class);

    public void addCustomer(){
        logger.trace("A TRACE Message");
    }
* */