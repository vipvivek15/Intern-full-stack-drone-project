package org.example.locationtracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.locationtracking")
public class LocationtrackingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationtrackingApplication.class, args);
    }

}
