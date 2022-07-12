package com.example.taxservice;

import Domain.AccountEntry;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class BankMessageListener {

    @JmsListener(destination = "QTaxService")
    public void receiveMessage(final String bankAsString ){
        ObjectMapper objMapper=new ObjectMapper();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            AccountEntry person = objectMapper.readValue(bankAsString, AccountEntry.class);
            System.out.println("JMS receiver received message Amount:" + person.getAmount());

        } catch (IOException e) {
            System.out.println("JMS receiver: Cannot convert : " + bankAsString+" to a Person object");
        }
    }


}



