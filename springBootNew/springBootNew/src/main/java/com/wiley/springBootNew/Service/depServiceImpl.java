package com.wiley.springBootNew.Service;

import com.wiley.springBootNew.model.Department;
import com.wiley.springBootNew.repository.DepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class depServiceImpl implements DepService {

    @Autowired
    private DepRepo deprepo;

    @Override
    public Department createDepartment(Department dep) {
        return deprepo.save(dep);
    }

    @Override
    public List<Department> getAllDepartmentList() {
        return deprepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return null;
    }

    @Override
    public Department updateDepartment(Long departmentId) {
        return null;
    }

    @Override
    public void delDepartment(Long deparmentId) {

    }

    @Override
    public Department getDepByName(String depName) {
        return null;
    }
}
