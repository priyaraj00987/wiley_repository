package com.wiley.springBootNew.Controller;

import com.wiley.springBootNew.Service.DepService;
import com.wiley.springBootNew.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
