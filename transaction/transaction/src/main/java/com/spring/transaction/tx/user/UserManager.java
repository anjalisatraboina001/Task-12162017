package com.spring.transaction.tx.user;

import java.util.List;

import com.spring.transaction.tx.model.User;

public interface UserManager {
	void insertUser(User user);
	
	  User getUserById(int userId);
		
	  User getUser(String username);
		
	  List<User> getUsers();
}
