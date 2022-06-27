package com.husky.hiric.service;

import com.husky.hiric.models.Department;
import com.husky.hiric.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    //save department
    public void saveDepartment(Department department){
        departmentRepo.save(department);
    }
    //find by name
    public Department findById(Integer id){
        return departmentRepo.findById(id).orElse(null);
    }
}
