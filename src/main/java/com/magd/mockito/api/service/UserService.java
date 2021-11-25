package com.magd.mockito.api.service;

import com.magd.mockito.api.model.User;

import java.util.List;

public interface UserService {

	User getUserById(Long id);

	List<User> getAllUsers();

	void deleteUserById(Long id);

	User saveUser(User user);
}
