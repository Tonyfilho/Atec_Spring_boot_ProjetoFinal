package pt.atec.blog.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import pt.atec.blog.model.User;
import pt.atec.blog.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User findByEmail(String email);

    User save(UserRegistrationDto registration);

}
