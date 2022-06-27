package com.husky.hiric;

import com.husky.hiric.models.Student;
import com.husky.hiric.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class HiricApplication {
    public static void main(String[] args) {
        SpringApplication.run(HiricApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
//        return args -> {
//            String date1 = "01-Jan-2000";
//            String date2 = "02-Feb-2017";
//            LocalDate d1 = LocalDate.parse(date1, formatter);
//            LocalDate d2 = LocalDate.parse(date2, formatter);
//            Student student1 = new Student(
//                    "Shu",
//                    "David",
//                    d1
//            );
//            //formatting date
//            Student student2 = new Student(
//                    "Shumb",
//                    "David",
//                    d2
//            );
////			 studentRepo.save(student1);
////			//saving multiple students at once
//            List<Student> students = new ArrayList<>();
//            students.add(student1);
//            students.add(student2);
//            System.out.println(students);
//            studentRepo.saveAll(students);
//            System.out.println(student1.getAge());
////			//getting number of students
//            System.out.printf("We have " + studentRepo.count() + " students");
////			//getting all students
//            studentRepo.findAll().forEach(System.out::println);
//            //deleting student
////            studentRepo.deleteById(1L);
////getting students
//            studentRepo.findAll().forEach(System.out::println);
////			//getting by fname
//            studentRepo.findByFirstName("Shumbu").forEach(System.out::println);
//        };
//    }

    @GetMapping("/")
    public String welcome() {

        return "Hello Byose";
    }
}
