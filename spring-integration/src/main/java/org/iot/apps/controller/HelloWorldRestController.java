package org.iot.apps.controller;

import org.iot.apps.beans.User;
import org.iot.apps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/user")
public class HelloWorldRestController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(User user){
        return userService.addUser(user);
    }

    @DeleteMapping
    public boolean deleteUser(int id){
        return userService.deleteUser(id);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        System.out.println("##########"+userId);
       return userService.getUser(userId);
    }

    @GetMapping
    public List<User> getUser(@AuthenticationPrincipal final UserDetails userDetails){
        final String userName = userDetails.getUsername();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        authorities.forEach(System.out::println);
        return userService.getUser();
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/users")
    public List<User> getUsers(){
        return userService.getUser();
    }
}
