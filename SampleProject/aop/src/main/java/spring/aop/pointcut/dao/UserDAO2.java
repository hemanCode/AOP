package spring.aop.pointcut.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAO2 {

	public UserDAO2() {
		//	Default
	}

	public void user() {
		System.out.println(getClass().getName() + " : Hi I'm the user2.");
	}

}
