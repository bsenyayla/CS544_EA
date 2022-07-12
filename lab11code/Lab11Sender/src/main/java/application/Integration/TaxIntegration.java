package application.Integration;

import application.Tool.Common;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class TaxIntegration {

    @Autowired
    private JmsTemplate jmsTemplate;

    public TaxIntegration() {
    }

    public void PutMessageToQueue(Object qValue) throws JsonProcessingException {
        String strJson= Common.getJsonData(qValue);
        jmsTemplate.convertAndSend("QTaxService",strJson);
        System.out.println("Sending a JMS message[QTaxService]:" + strJson);
    }

}
