package com.magd.mockito.api;

import com.magd.mockito.api.model.User;
import com.magd.mockito.api.repository.UserRepository;
import com.magd.mockito.api.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMockitoUsersApplicationTests {

	@MockBean
	private UserRepository repository;

	@Autowired
	private UserService service;


	@org.junit.Test
	public void getUsersTest() {
		when(repository.findAll())
			.thenReturn(Stream.of(new User(101, "Alidada", "user"))
				.collect(Collectors.toList()));
		Assertions.assertEquals(1, service.getAllUsers().size());
	}



}
