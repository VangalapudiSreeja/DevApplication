package com.app.dca.repository;

import com.app.dca.entity.User;

public interface IUserRepository {
	
	User login(User user);
	
	User logout(User user);
}
