package com.test.company.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	// String password = "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6";
	// String admin    = "$2a$12$vtCytbTZAVxUTMuj7wiPyOKNgbMvpawTc9lY8Z3JHoX/6.5/stYj6";


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("Admin".equals(username)) {
			return new User("Admin", "$2a$12$vtCytbTZAVxUTMuj7wiPyOKNgbMvpawTc9lY8Z3JHoX/6.5/stYj6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}