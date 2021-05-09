package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student paulo = new Student(
                    "Paulo",
                    "paulo.previlato@gmail.com",
                    LocalDate.of(1994, Month.JULY, 11)
            );
            Student shelly = new Student(
                    "Shelly",
                    "shelly.previlato@gmail.com",
                    LocalDate.of(1998, Month.APRIL, 27)
            );
            repository.saveAll(
                    List.of(paulo, shelly)
            );
        };
    }
}
