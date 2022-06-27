package com.husky.hiric.controller;

import com.husky.hiric.models.Department;
import com.husky.hiric.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    //save department
    @PostMapping("/save")
    public String saveDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return "saveDepartment";
    }
}
