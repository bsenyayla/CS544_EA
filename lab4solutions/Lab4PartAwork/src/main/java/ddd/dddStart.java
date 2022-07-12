package ddd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import parta.DepartmentApplication;
import parta.domain.Department;
import parta.domain.Employee;

import java.util.Optional;

@SpringBootApplication
public class dddStart implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DepartmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
