package spring.aop.before.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAO2 {

	public UserDAO2() {
		//	Default
	}

	public void getUser() {
		System.out.println(getClass().getName() + " : Hi I'm the user2.");
	}

}
