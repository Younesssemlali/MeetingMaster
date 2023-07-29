package com.group.meeting;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@SpringBootApplication
public class MeetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingApplication.class, args);
	}

@Bean
	CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
		PasswordEncoder passwordEncoder=passwordEncoder();
		return args -> {
			UserDetails u1= jdbcUserDetailsManager.loadUserByUsername("user1");
			if(u1==null)
			jdbcUserDetailsManager.createUser(
					User.withUsername("user1").password(passwordEncoder.encode("1234")).roles("USER").build()
			);
			UserDetails u2= jdbcUserDetailsManager.loadUserByUsername("user2");
			if (u2==null)
			jdbcUserDetailsManager.createUser(
			User.withUsername("user2").password(passwordEncoder.encode("1234")).roles("USER").build()
			);
			UserDetails u3= jdbcUserDetailsManager.loadUserByUsername("admin");
			if (u3==null)
			jdbcUserDetailsManager.createUser(
			User.withUsername("admin").password(passwordEncoder.encode("1234")).roles("ADMIN").build()
			);
		};
}
@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
}

}
