package com.imsc.det.profil.beans.config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter { 
	@Autowired	
	public void globalConfig(AuthenticationManagerBuilder auth,DataSource dataSource) throws Exception {
		
	//	auth.inMemoryAuthentication().withUser("root").password("mdp").roles("ADMIN");
	auth.jdbcAuthentication()
	.dataSource(dataSource)
	.usersByUsernameQuery("select nom_admin as principal , mot_de_passe_admin as credentials , true  from admin where nom_admin = ?  ")
	.authoritiesByUsernameQuery("select nom_admin as principal , role as credentials   from admin where nom_admin = ?  ")             ;	
	
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http 
			.csrf().disable()
			.authorizeRequests()
				.anyRequest()
					.authenticated()
						.and()
				.formLogin()
					.loginPage("/login")
						.permitAll()
				.defaultSuccessUrl("/admin.html")
				.and()
				.logout()
					.invalidateHttpSession(true)
					.logoutUrl("/logout")
					.permitAll();	
	}
	
	
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/questionnaire.html");
	}
	
	
    @Bean
    public static PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
