package customers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");


		ICustomerService customerService = context.getBean("customerService",	ICustomerService.class);



		customerService.addCustomer("Frank Brown", "fbrown@acme.com",
				"mainstreet 5", "Chicago", "60613");

		customerService.ShowInfo();


		ConfigurableApplicationContext cContext=new ClassPathXmlApplicationContext("springconfig.xml");
		ICustomerService customerService1 = cContext.getBean("customerService",	ICustomerService.class);
		customerService1.ShowInfo();
		cContext.close();

	}
}

