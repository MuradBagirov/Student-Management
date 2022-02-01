package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("Murad", "Bagirov", "murad@mail.ru");
//        studentRepository.save(student1);
//
//        Student student2=new Student("Anar","Bagirov","anar@mail.ru");
//        studentRepository.save(student2);
//
//        Student student3=new Student("Eldeniz","Abdullayev","eldeniz@mail.ru");
//        studentRepository.save(student3);


    }
}
