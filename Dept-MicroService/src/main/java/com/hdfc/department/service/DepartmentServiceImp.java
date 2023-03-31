package com.hdfc.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.department.dto.DepartmentDTO;
import com.hdfc.department.entity.Department;
import com.hdfc.department.repository.IDepartmentRepository;

@Service
public class DepartmentServiceImp implements IDepartmentService {
	
	@Autowired
	IDepartmentRepository repo;

	@Override
	public Department addDepartment(DepartmentDTO deptDTO	) {
		
		Department dept = new Department();
		dept.setDepartmentId(deptDTO.getDepartmentId());
		dept.setDepartmentName(deptDTO.getDepartmentName());
		dept.setDepartmentAddress(deptDTO.getDepartmentAddress());
		dept.setDepartmentCode(deptDTO.getDepartmentCode());
		return repo.save(dept);
	}

	@Override
	public Department getDepartment(long id) {
		
		return repo.findById(id).orElse(null);
	}

}
