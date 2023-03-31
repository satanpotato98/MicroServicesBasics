package com.hdfc.user.service;

import com.hdfc.user.dto.UserDTO;
import com.hdfc.user.entity.User;
import com.hdfc.user.vo.UserDepartment;

public interface IUserService {
	
	public User addUser(UserDTO userDTO);
	public User getUserById(long userId);
	public UserDepartment getUserWithDepartmentByID(long userId);

}
