package app;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {
    @EventListener
    public  void onEvent(AddCustomerEvent event){
        System.out.println("received event:" + event.getMessage());
    }
}

