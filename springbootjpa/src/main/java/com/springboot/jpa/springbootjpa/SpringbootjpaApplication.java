package com.springboot.jpa.springbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springboot.jpa.springbootjpa.dao.UserRepository;
import com.springboot.jpa.springbootjpa.entities.User;

@SpringBootApplication
@ComponentScan("com.springboot.jpa.springbootjpa")  // Ensure it scans all packages
@EnableJpaRepositories("com.springboot.jpa.springbootjpa.dao")  // Add package where UserRepository exists
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		System.out.println("Started........");
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
		user.setName("Yash Sudhirrao Desai");
		user.setCity("Pune");
		user.setStatus("Student");
		User user1 = userRepository.save(user);
		System.out.println(user1);
	}

}
