package com.hdfc.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.department.entity.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Long> {

}
