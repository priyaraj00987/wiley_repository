package com.wiley.springBootNew.Service;

import com.wiley.springBootNew.model.Department;
import com.wiley.springBootNew.repository.DepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        Optional<Department>dep=deprepo.findById(departmentId);
        return dep.get();
    }

    @Override
    public Department updateDepartment(Long departmentId) {
        return null;
    }

    @Override
    public void delDepartment(Long deparmentId) {

    }

//    @Override
//    public void delDepartment(Long deparmentId,Department dep) {
//        Department depFromDB=deprepo.findById(deparmentId).get();
//        if(Objects.nonNull(dep.getDepartmentName())) && !"".equalsIgnoreCase(dep.getDepartmentName()){
//            depFromDB.setDepartmentName(dep.getDepartmentName());
//        }
//        if(Objects.nonNull(dep.getDepartmentCode()))&&!"".equalsIgnoreCase(dep.getDepartmentName()){
//            depFromDB.setDepartmentName(dep.getDepartmentName());
//        }
//
//        deprepo.deleteById(deparmentId);
//
//    }

    @Override
    public Department getDepByName(String depName) {
        return null;
    }
}
