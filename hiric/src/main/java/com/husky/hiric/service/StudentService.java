package com.husky.hiric.service;

import com.husky.hiric.models.Student;
import com.husky.hiric.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
    public void saveStudent(Student student){
        studentRepo.save(student);
    }
    //get by id
    public Student getStudentById(Long id){
        return studentRepo.findById(id).orElse(null);
    }
    //find by email
    public Optional<Student> findByEmail(String email){
        return studentRepo.findByEmail(email);
    }
    //delete
    public String deleteStudent(Long id){
        Student student=studentRepo.findById(id).orElse(null);
        if (student!=null){
            studentRepo.delete(student);
            return "Student deleted successfully";
        }
        return "Student not found";
    }
    //find by last name
    public List<Student> findByLastName(String lastName){
        return studentRepo.findByLastName(lastName);
    }
}
