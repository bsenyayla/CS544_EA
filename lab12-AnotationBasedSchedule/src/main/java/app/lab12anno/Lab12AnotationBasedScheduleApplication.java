package app.lab12anno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling /* schedule işlemleri için aktif duruma getirliyor. Sonra schedule anotation ı ile
methodler belirtilen aralıkta çalıştırıılıyo*/
public class Lab12AnotationBasedScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab12AnotationBasedScheduleApplication.class, args);

        System.out.println("Test.....");
    }

}