package com.javahash.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  auth.inMemoryAuthentication().withUser("tom").password("123456").roles("USER");
	  auth.inMemoryAuthentication().withUser("bill").password("123456").roles("ADMIN");
	  auth.inMemoryAuthentication().withUser("james").password("123456").roles("SUPERADMIN");
	  auth.inMemoryAuthentication().withUser("alok").password("1234567").roles("WSADMIN");
	  
	}
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
 
	  http.authorizeRequests()
		.antMatchers("/protected/**").access("hasRole('ROLE_ADMIN')")
		.antMatchers("/confidential/**").access("hasRole('ROLE_SUPERADMIN')")
		.antMatchers("/ws/**").access("hasRole('ROLE_WSADMIN')")
		.and().formLogin();
 
	}
	

}
