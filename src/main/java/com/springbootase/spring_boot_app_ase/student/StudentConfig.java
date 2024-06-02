package com.springbootase.spring_boot_app_ase.student;

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
            StudentRepository repository){
        return args -> {
            Student zia =  new Student(1L,
                            "Zia",
                            "zia@gmail.com",
                            LocalDate.of(1999, Month.DECEMBER, 5));

            Student yutong =  new Student(1L,
                    "Yutong",
                    "yutong@gmail.com",
                    LocalDate.of(1999, Month.DECEMBER, 5));

            repository.saveAll(List.of(zia,yutong));
        };
    }
}
