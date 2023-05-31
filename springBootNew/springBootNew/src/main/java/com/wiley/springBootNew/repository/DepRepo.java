package com.wiley.springBootNew.repository;

import com.wiley.springBootNew.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepRepo extends JpaRepository<Department, Long> {
}
