package com.example.demo;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;
import java.util.Map;


public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //zarządzanie dostępami z poziomu bazy danych
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser(new User("Jan", "Jan123", Collections.singleton(new SimpleGrantedAuthority("user"))));  //String username, String password, Collection<? extends GrantedAuthority> authorities
    }

    //zarządzanie dostępami z poziomu http
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/test1").authenticated()
                .and()
                .formLogin().permitAll();
    }
}
