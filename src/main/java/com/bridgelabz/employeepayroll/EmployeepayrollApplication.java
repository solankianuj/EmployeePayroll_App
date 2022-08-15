package com.bridgelabz.employeepayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.bridgelabz.employeepayroll.repository")
public class EmployeepayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeepayrollApplication.class, args);
    }

}
