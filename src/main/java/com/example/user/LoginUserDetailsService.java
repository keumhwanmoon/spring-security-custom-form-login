package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author jason, Moon
 * @since 2016-10-06
 */
@Service
public class LoginUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public LoginUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        System.out.println("loginId = " + loginId);
        UserDetails userDetails = userRepository.findByLoginId(loginId);
        System.out.println("userDetails = " + userDetails);

        return userDetails;
    }
}
