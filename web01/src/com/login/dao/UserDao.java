package com.login.dao;

import com.login.beans.User;

public interface UserDao {

	public User getUserByUsernameAndPassword(String username,String password);
}
