package com.cybage.service;

import java.util.List;

import com.cybage.dao.UserDao;
import com.cybage.model.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> findUser() throws Exception{
		return userDao.findUser();
	}

}
