package customers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class CustomerService implements ICustomerService {
	ICustomerDAO customerDAO = new CustomerDAO();
	IEmailSender emailSender = new EmailSender();


	public CustomerService(){
		System.out.println("X:Constructor....");
	}

	@PostConstruct
	public void init(){
		System.out.println("X:init....");
	}

	@PreDestroy
	public  void cleanup(){
		System.out.println("X:cleanup....");
	}

	public void addCustomer(String name, String email, String street,
			String city, String zip) {

		Customer customer = new Customer(name, email);
		Address address = new Address(street, city, zip);

		customer.setAddress(address);

		customerDAO.save(customer);

		emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
	}

	@Override
	public void ShowInfo() {
		System.out.println("Log:ShowINfo....");
	}


}
