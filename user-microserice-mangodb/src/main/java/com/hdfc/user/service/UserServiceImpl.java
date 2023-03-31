package com.hdfc.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.user.dto.UserDTO;
import com.hdfc.user.entity.User;
import com.hdfc.user.repository.IUserRepository;
import com.hdfc.user.vo.Department;
import com.hdfc.user.vo.UserDepartment;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository repo;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public User addUser(UserDTO userDTO) {
		User user = new User();
		user.setUserId(userDTO.getUserId());
		user.setUserName(userDTO.getUserName());
		user.setEmail(userDTO.getEmail());
		user.setDeptId(userDTO.getDeptId());
		return repo.save(user);
	}

	@Override
	public User getUserById(long userId) {
		
		return repo.findById(userId).orElse(null);
	}

	@Override
	public UserDepartment getUserWithDepartmentByID(long userId) {
		User user = getUserById(userId);
		long deptId = user.getDeptId();
		Department department = restTemplate.getForObject("http://localhost:8282/api/v1/department/get/" + deptId,Department.class);

		return new UserDepartment(user, department);
	}

}
