 package com.hdfc.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.department.dto.DepartmentDTO;
import com.hdfc.department.entity.Department;
import com.hdfc.department.service.IDepartmentService;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentRestController {
	@Autowired
	IDepartmentService service;
	
	@PostMapping("/add")
	public Department addDepartment(@RequestBody DepartmentDTO deptDTO) {
		return service.addDepartment(deptDTO);
	}
	
	@GetMapping("/get/{id}")
	public Department getDepartment(@PathVariable long id) {
		return service.getDepartment(id);
	}
}
