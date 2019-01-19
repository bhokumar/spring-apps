package org.smartrobo.apps.service;

import org.smartrobo.apps.business.CustomUserDetails;
import org.smartrobo.apps.business.User;
import org.smartrobo.apps.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        final Optional<User> user = userRepository.findByName(userName);
        user.orElseThrow(()->new UsernameNotFoundException("User not found"));
        return user.map(u->new CustomUserDetails(u)).get();
    }
}
