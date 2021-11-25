package com.magd.mockito.api.repository;

import com.magd.mockito.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
