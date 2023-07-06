package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		
//		user.setName("kunal");
//		user.setCity("faridabad");
//		user.setStatus("i am java programmer ");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
//		User user1 = new User();
//		user1.setName("anjali");
//		user1.setCity("faridabad1");
//		user1.setStatus("i am java programmer1 ");
//		
//		
//		User user2 = new User();
//		user2.setName("sunny");
//		user2.setCity("faridabad2");
//		user2.setStatus("i am java programmer2 ");
//		
//		  List<User> users = List.of(user1,user2);
//		  
//		 Iterable<User> result =  userRepository.saveAll(users);
//		 
//		 result.forEach(user->{
//			 System.out.println(user);
//		 });
		
		
		//  update 
		
		 Optional<User> optional = userRepository.findById(3);
		 
		 User user = optional.get();
		 user.setName("anjali");
		User result = userRepository.save(user);
		 
		 System.out.println(result);
		
	}

}
