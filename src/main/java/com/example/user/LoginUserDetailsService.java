package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

        Optional<UserDetails> userDetails = Optional.ofNullable(userRepository.findByLoginId(loginId));

        return userDetails.orElseThrow(() -> new UsernameNotFoundException("Invalid username."));
    }
}
