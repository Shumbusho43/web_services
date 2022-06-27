package com.husky.hiric.controller;

import com.husky.hiric.models.Department;
import com.husky.hiric.models.Student;
import com.husky.hiric.service.DepartmentService;
import com.husky.hiric.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;
    private DepartmentService departmentService;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
//        String date1 = student.getDob().toString();
//        LocalDate d1 = LocalDate.parse(date1, formatter);
//        student.setDob(d1);
        //finding department name
        studentService.saveStudent(student);
        return "Student saved successfully";
    }
    //get by id
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    //update
    @PutMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student student){
        Student std=studentService.getStudentById(id);
        if (std!=null){
            std.setFirstName(student.getFirstName());
            std.setLastName(student.getLastName());
            studentService.saveStudent(std);
            return "Student updated successfully";
        }
        return "Student not found";
    }
    //find by email
    @GetMapping("/students/email")
    public Student findByEmail(@RequestParam String email){
        return studentService.findByEmail(email).orElse(null);
    }
    //delete
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        Student student=studentService.getStudentById(id);
        if (student!=null){
            studentService.deleteStudent(id);
            return "Student deleted successfully";
        }
        return "Student not found";
    }
    //fing by last name
    @GetMapping("/students/lastname/{lastname}")
    public List<Student> findByLastName(@PathVariable("lastname") String lastName){
        return studentService.findByLastName(lastName);
    }
}
