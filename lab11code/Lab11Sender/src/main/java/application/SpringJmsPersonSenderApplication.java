package application;
import  application.jms.*;
import application.Service.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class SpringJmsPersonSenderApplication implements CommandLineRunner {

	@Autowired
	JmsTemplate jmsTemplate;

	@Autowired
	BankService bankService;

	public static void main(String[] args)  {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJmsPersonSenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		application.Integration.jms.Person
		Person person = new Person("Frank", "Brown");
		//convert person to JSON string
		ObjectMapper objectMapper = new ObjectMapper();
		String personAsString = objectMapper.writeValueAsString(person);
		System.out.println("Sending a JMS message:" + personAsString);
		jmsTemplate.convertAndSend(application.Integration.jms.QNames.QTest,personAsString);
		System.out.println("OK1");

		String strJson=Tool.Common.getJsonData(QNames.QCalc);
		jmsTemplate.convertAndSend(QNames.QCalc,strJson);
		System.out.println("Sending a JMS message[" + QNames.QCalc + "]:" + strJson);
		System.out.println("OK2");

		bankService.deposit(new AccountEntry(
				"10.10.2010",
				1002.09,
				"Last coursw",
				"1111",
				"2222"
		));
		System.out.println("OK3");
	}





}