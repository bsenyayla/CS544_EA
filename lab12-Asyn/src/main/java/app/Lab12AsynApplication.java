package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties(MailProperties.class)
public class Lab12AsynApplication   implements CommandLineRunner {
    @Autowired
    CustomerService customerService;

    @Value(" ${testVal}")
    String outgoingMailServer;

    @Autowired
    MailService mailService;


    public static void main(String[] args) {
        SpringApplication.run(Lab12AsynApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


        System.out.println("testValue:" + outgoingMailServer);

        customerService.addCustomer();

        mailService.print();



    }
}
