package com.springbootase.spring_boot_app_ase.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Zia",
                        "zia@gmail.com",
                        LocalDate.of(1999, Month.DECEMBER, 5),
                        24)
        );
    }
}
