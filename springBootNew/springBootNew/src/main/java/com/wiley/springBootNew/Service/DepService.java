package com.wiley.springBootNew.Service;

import com.wiley.springBootNew.model.Department;

import java.util.List;

public interface DepService {
    public Department createDepartment(Department dep);

    public List<Department> getAllDepartmentList();

    public Department getDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId);

    public void delDepartment(Long deparmentId);

    Department getDepByName(String depName);

}
