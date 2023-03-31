package com.hdfc.user.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.user.dto.UserDTO;
import com.hdfc.user.entity.User;
import com.hdfc.user.service.IUserService;
import com.hdfc.user.vo.UserDepartment;

@RestController
@RequestMapping("/api/v2/users")
public class UserRestController {
	
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public User addUser(@RequestBody UserDTO userDTO) {
		return service.addUser(userDTO);
	}
	
	@GetMapping("/get/{id}")
	public User getUserById(@PathVariable long id) {
		return service.getUserById(id);
	}
	
	@GetMapping("/get-userdepartment/{userId}")
	public UserDepartment getUserWithDepartmentByUserId(@PathVariable long userId) {
		return service.getUserWithDepartmentByID(userId);
	}

}
