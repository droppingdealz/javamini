package com.cybage.service;

import java.util.List;

import com.cybage.model.Courses;
import com.cybage.model.User;

public interface UserService {
	public List<User> findUser() throws Exception;

}
