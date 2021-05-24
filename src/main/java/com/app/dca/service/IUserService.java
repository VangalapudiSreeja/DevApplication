package com.app.dca.service;

import com.app.dca.entity.User;

public interface IUserService {
	
	User login(User user);
	
	User logout(User user);
}
