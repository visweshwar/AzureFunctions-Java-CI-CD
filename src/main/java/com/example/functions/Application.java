package com.example.functions;

import com.example.functions.model.User;
import java.util.ArrayList;
import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}

	private ArrayList<User> users = new ArrayList<User>(){{
		add(new User(1,"userone","User","One"));
		add(new User(2,"usertwo","User","Two"));
		add(new User(3,"userthree","User","Three"));
		add(new User(4,"userfour","User","Four"));
	}};
	@Bean
	public Function<String, User> GetUser(){
		return userId -> users.get(Integer.valueOf(userId)-1);
	}
}
