package app.lab12;

import org.quartz.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;

@SpringBootApplication
public class Lab12Application {

    public static void main(String[] args) throws SchedulerException {
        SpringApplication.run(Lab12Application.class, args);



        // TimerTask ===================================================================================================
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new HelloWorldTask(), 5000, 5000);

        System.out.println("test");


    }

}
