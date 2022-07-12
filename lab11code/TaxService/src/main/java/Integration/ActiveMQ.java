package Integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class ActiveMQ {
    @Autowired
    static JmsTemplate jmsTemplate;

    public static void PutMessageToQueue(Object qValue ,String qName) throws JsonProcessingException {
        String strJson=Tool.Common.getJsonData(qValue);
        jmsTemplate.convertAndSend(qName,strJson);
        System.out.println("Sending a JMS message[" + qName + "]:" + strJson);
    }
}
