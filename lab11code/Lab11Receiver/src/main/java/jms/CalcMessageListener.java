package jms;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class CalcMessageListener {

    static Integer total=0;

    @JmsListener(destination = "calc")
    public void receiveMessage(final String calcAsString){
        ObjectMapper objMapper=new ObjectMapper();
        try {
            Calc cc=objMapper.readValue(calcAsString,Calc.class);

            switch (cc.getOperator()){
                case "+":
                    total+=cc.getValue();
                    break;
                case "*":
                    total*=cc.getValue();
                    break;
                case "-":
                    total-=cc.getValue();
                    break;
            }

            System.out.println("Received[calc] Value :["+cc.getOperator() +"]"+ cc.getValue() + " TotalValue:" + total);
        }
        catch (IOException e){
            System.out.println("Err[calc]:" + calcAsString);
        }

    }
}