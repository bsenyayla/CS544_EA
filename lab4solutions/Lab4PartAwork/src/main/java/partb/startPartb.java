package partb;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class startPartb implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(startPartb.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Part B çalışıyor");
    }
}
