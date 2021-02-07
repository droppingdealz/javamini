package com.cybage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.User;

public interface UserDao {
	public List<User> findUser() throws Exception;
}
