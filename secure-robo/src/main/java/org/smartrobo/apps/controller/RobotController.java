package org.smartrobo.apps.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/rest/robot")
public class RobotController {
    private static final Logger LOGGER = Logger.getLogger(RobotController.class.getName());

    @GetMapping
    public String chat(@AuthenticationPrincipal UserDetails userDetails){
        LOGGER.log(Level.INFO,"Logging user name : "+userDetails.getUsername());
        LOGGER.log(Level.INFO,userDetails.getPassword());
       // userDetails.getAuthorities().stream().forEach(System.out::print);
        return "hello";
    }
}
