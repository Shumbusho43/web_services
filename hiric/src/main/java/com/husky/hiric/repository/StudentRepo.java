package com.husky.hiric.repository;

import com.husky.hiric.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    //fing by email
    Optional<Student> findByEmail(String email);
    //fing by last name
    List<Student> findByLastName(String lastName);
}
