package com.Ems.Ems.services;

import com.Ems.Ems.security.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	}