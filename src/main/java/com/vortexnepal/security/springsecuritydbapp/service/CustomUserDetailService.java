package com.vortexnepal.security.springsecuritydbapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vortexnepal.security.springsecuritydbapp.model.CustomeUserDetail;
import com.vortexnepal.security.springsecuritydbapp.model.User;
import com.vortexnepal.security.springsecuritydbapp.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User>  optionalUser = userRepo.findByEmail(email);
		optionalUser
		.orElseThrow(() -> new UsernameNotFoundException("Email Not Found !!"));
		return optionalUser
				.map(CustomeUserDetail::new ).get();
	}

}
