package com.spring.transaction.tx.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.transaction.tx.dao.UserDAO;
import com.spring.transaction.tx.model.User;
import com.spring.transaction.tx.user.UserManager;
@Service
public class UserManagerImpl implements UserManager {
	 @Autowired
	  private UserDAO userDAO;
	  
	  @Transactional
	  public void insertUser(User user) {
	    userDAO.insertUser(user);
	  }

	  @Transactional
	  public User getUserById(int userId) {
	    return userDAO.getUserById(userId);
	  }
	  
	  @Transactional
	  public User getUser(String username) {
	    return userDAO.getUser(username);
	  }

	  @Transactional
	  public List<User> getUsers() {
	    return userDAO.getUsers();
	  }

}
