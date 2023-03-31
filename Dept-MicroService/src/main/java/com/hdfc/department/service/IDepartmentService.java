package com.hdfc.department.service;

import com.hdfc.department.dto.DepartmentDTO;
import com.hdfc.department.entity.Department;

public interface IDepartmentService {
	
	public Department addDepartment(DepartmentDTO deptDTO);
	public Department getDepartment(long id);

}
