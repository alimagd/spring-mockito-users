package com.magd.mockito.api.service.impl;

import com.magd.mockito.api.model.User;
import com.magd.mockito.api.repository.UserRepository;
import com.magd.mockito.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User getUserById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public void deleteUserById(Long id) {

		repository.deleteById(id);

	}

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}
}
