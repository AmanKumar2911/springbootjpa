package com.first.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.first.demo.Entity.user;
import com.first.demo.Repositry.UserRepo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		// user user = new user();
		// user.setName("Avinash Kumar");
		// user.setCity("Delhi");
		// user.setStatus("hello i am avinash and i am busy");

		// user user1 = userRepo.save(user);
		// System.out.println(user1);

		//creating new user
		/* 

		user user2 = new user();
		user2.setName("Anu");
		user2.setCity("Bihar");
		user2.setStatus("Tester");

		user user3 = new user();
		user3.setName("gaurav");
		user3.setCity("up");
		user3.setStatus("web developer");

		List<user> users = List.of(user2,user3);
		Iterable<user> result = userRepo.saveAll(users);
		result.forEach(user->{
			System.out.println(user);
		});

		*/

		//update the user of id 203

		/* 
		Optional<user> opt=userRepo.findById(203);
		user user = opt.get();
		user.setName("gaurav maurya");
		user result = userRepo.save(user);
		System.out.println(user);
		System.out.println(result);
		*/

		//how to get the data
		//find by id - return Optional containg your data
		/* 

		Iterable<user> itr = userRepo.findAll();
		itr.forEach(user->{
			System.out.println(user);
		});

		*/

		//Deleting the user element
		/*userRepo.deleteById(1);
		System.out.println("deleted id 1");*/

		/* 
		Iterable<user> allusers = userRepo.findAll();
		allusers.forEach(user->System.out.println(user));

		userRepo.deleteAll(allusers);
		System.out.println("deleted all users");
		*/

		// List<user> u = userRepo.findByName("gaurav maurya");
		// u.forEach(obj->{
		// 	System.out.println(obj);
		// });

		// List<user> u = userRepo.findByNameAndCity("Aman Kumar","Delhi");
		// u.forEach(obj->{
		// 	System.out.println(obj);
		// });

		// List<user> u = userRepo.getAllUser();
		// u.forEach(obj->{
		// 	System.out.println(obj);
		// });


		List<user> u = userRepo.getUserByName("gaurav maurya"); 
		u.forEach(obj->{
			System.out.println(obj);
		});


	}

}
