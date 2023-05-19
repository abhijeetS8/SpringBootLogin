package com.example.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.springboot.Entity.Register;
import com.example.spring.springboot.Repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void SaveUser(Register register) {
		userRepo.save(register);
		
	}
	
}
