package spring.aop.before.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	public UserDAO() {
		//	Default
	}

	public void getUser(String name) {
		System.out.println(getClass().getName() + " : Hi I'm the " + name +".");
		getUserIn();
	}
	
	public void getUser(String name, int age) {
		System.out.println(getClass().getName() + " : Hi I'm the " + name +" age : "+ age+ ".");
	}
	
	private void getUserIn() {
		System.out.println(getClass().getName() + " : Hi I'm the user IN");
	}

}
