package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class InMemoryAuthentication extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("Bala")
			.password("Bala")
			.roles("USER_ROLE")
			.and()
			.withUser("Hemsai")
			.password("Hemsai")
			.roles("USER_ROLE")
			.and()
			.withUser("Jaswin")
			.password("Jaswin")
			.roles("USER_ROLE")
			.and()
			.withUser("user")
			.password("user")
			.roles("USER_ROLE");
	}
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
