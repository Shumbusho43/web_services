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
//	@Bean
//     CommandLineRunner commandLineRunner(StudentRepo studentRepo){
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yy-mm-dd");
//		 return args->{
//			 String date="2010-02-20";
//			 //formatting date
//			 LocalDate localDate=LocalDate.parse(date,formatter);
//			 Student student1=new Student(
//					 "Shumbusho",
//					 "David",
//					 localDate
//			 );
//			 String date2="2010-02-20";
//			 //formatting date
//			 LocalDate localDate2=LocalDate.parse(date,formatter);
//			 Student student2=new Student(
//					 "Shumbusho",
//					 "David",
//					 localDate2
//			 );
////			 studentRepo.save(student1);
//			 //saving multiple students at once
//			 List<Student> students= new ArrayList<>();
//			 students.add(student1);
//			 students.add(student2);
//			 studentRepo.saveAll(students);
//			 //getting number of students
//			 System.out.printf("We have "+studentRepo.count()+" students");
//			 //getting all students
//			 studentRepo.findAll().forEach(System.out::println);
//			 //deleting student
//			 studentRepo.deleteById(1);
//			 //getting students
//			 studentRepo.findAll().forEach(System.out::println);
//			 //getting by fname
//			 studentRepo.findByFirstName("Shumbu").forEach(System.out::println);
//		 };
//	 }
	public static void main(String[] args) {
		SpringApplication.run(HiricApplication.class, args);
	}
	@GetMapping("/")
	public String welcome() {
		return "Hello Byose";
	}
}
