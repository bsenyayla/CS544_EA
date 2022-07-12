package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void addCustomer(){
        publisher.publishEvent(new AddCustomerEvent("test"));


    }
}
