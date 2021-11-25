package com.magd.mockito.api.controller;


import com.magd.mockito.api.model.User;
import com.magd.mockito.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public User readUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUserById(id);

	}
}
