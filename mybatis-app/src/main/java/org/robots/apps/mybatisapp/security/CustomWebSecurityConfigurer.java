package org.robots.apps.mybatisapp.security;

import org.robots.apps.mybatisapp.security.encoders.CustomPasswordEncoder;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class CustomWebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth)throws Exception{
        auth.inMemoryAuthentication().passwordEncoder(new CustomPasswordEncoder()).withUser("user1").password("password").roles("ADMIN");
    }

    @Override
    public void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.antMatcher("**/secured/city").authorizeRequests().anyRequest().permitAll();
    }

}
