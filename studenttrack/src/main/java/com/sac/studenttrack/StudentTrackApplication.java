package com.sac.studenttrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sac.studenttrack")
public class StudentTrackApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentTrackApplication.class, args);
    }


}
