package com.springbootase.spring_boot_app_ase;

import com.springbootase.spring_boot_app_ase.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringBootAppAseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppAseApplication.class, args);
	}

}
