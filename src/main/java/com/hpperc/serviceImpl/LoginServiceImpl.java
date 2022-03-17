package com.hpperc.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpperc.ExceptionHandling.UserNotFoundException;
import com.hpperc.model.User;
import com.hpperc.repository.LoginRepositoty;
import com.hpperc.service.LoginService;
import com.hpperc.utils.LoginDetails;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepositoty loginRepositoty;
	
	@Override
	public Boolean getUserID(LoginDetails loginDetails) {
		
		Optional<User> user = Optional.ofNullable(loginRepositoty.findUser(loginDetails.getUsername(),loginDetails.getPassword()));
		if(!user.isPresent()) {
			throw new UserNotFoundException();
		}
		
		return true;
	}
	
	

}
