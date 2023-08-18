package com.example.studentmanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

//    @Autowired
//    private StudentRepository studentRepository;

//    @Override
//    public void run(String... args) throws Exception {
//
//        Student student3 = new Student("Nike", "Less", "lNike@yandex.ru");
//        studentRepository.save(student3);
//    }
}
