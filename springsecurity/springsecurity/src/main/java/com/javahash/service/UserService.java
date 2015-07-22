package com.javahash.service;

import com.javahash.model.User;
import javax.jws.WebService;

@WebService
public interface UserService {

	public User getUserDetails(Long userID);
}
