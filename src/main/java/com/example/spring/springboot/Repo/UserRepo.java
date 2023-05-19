package com.example.spring.springboot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.springboot.Entity.Register;
import com.example.spring.springboot.Entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

	User findByName (String userName);

	void findByPassword(String password);

	void save(Register register);
	
}
