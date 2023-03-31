package com.hdfc.user.vo;

import com.hdfc.user.entity.User;

public class UserDepartment {
	
	private User user;
	private Department dept;
	
	public UserDepartment() {
		super();
	}

	public UserDepartment(User user, Department dept) {
		super();
		this.user = user;
		this.dept = dept;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	

}
