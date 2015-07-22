package com.javahash.service;

import org.springframework.stereotype.Service;

import com.javahash.model.User;
import javax.jws.WebService;

@Service
@WebService(serviceName = "userService", endpointInterface = "com.javahash.service.UserService")

public class UserServiceImpl implements UserService  {


	public User getUserDetails(Long userID) {
		User user = new User(userID, "alok", "sharma", "Noida");
		return user;
		
	}

}
