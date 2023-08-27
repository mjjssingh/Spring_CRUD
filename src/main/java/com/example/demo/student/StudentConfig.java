package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository
    ){
        return   args -> {
            Student jabez = new Student(
                    "Jabez",
                    "jabez@gmail.com",
                    LocalDate.of(2001,6,6)
            );
            Student jebaraj = new Student(
                    "Jebaraj",
                    "jebaraj@gmail.com",
                    LocalDate.of(2003,6,6)
            );
            studentRepository.saveAll(
                    List.of(jabez, jebaraj)
            );
        };
    }
}
