package com.wiley.springBootNew.Controller;

import com.wiley.springBootNew.Service.DepService;
import com.wiley.springBootNew.exception.DepNotFoundException;
import com.wiley.springBootNew.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepService depService;

    @PostMapping("/deps")
    public Department createDepartment(@RequestBody Department dep) {
        return depService.createDepartment(dep);
    }

    @GetMapping("/deps")
    public List<Department> getAllDepartments() {
        return depService.getAllDepartmentList();
    }

    @GetMapping("/deps/{id}")
    public Department getDepById(@PathVariable("id") Long depId) throws DepNotFoundException {

        return depService.getDepartmentById(depId);

    }



}