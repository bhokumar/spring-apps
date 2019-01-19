package org.iot.apps.service;

import org.iot.apps.model.CustomUserDetails;
import org.iot.apps.model.User;
import org.iot.apps.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = usersRepository.findByName(username);
        optionalUser.orElseThrow(()-> new UsernameNotFoundException("User Name not found!"));
        return optionalUser.map(CustomUserDetails::new).get();
    }
}
