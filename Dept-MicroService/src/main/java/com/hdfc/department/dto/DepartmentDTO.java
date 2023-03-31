package com.hdfc.department.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DepartmentDTO {  //POJO DTO-data transfer object VO-View Object
	
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

}
