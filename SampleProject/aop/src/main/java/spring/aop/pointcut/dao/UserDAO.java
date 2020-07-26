package spring.aop.pointcut.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	private String lastName;
	private String firstName;
	public UserDAO() {
		//	Default
	}

	public void addUser(String name) {
		System.out.println(getClass().getName() + " : Hi I'm the " + name +".");
		getUserIn();
	}
	
	public void addUser(String name, int age) {
		System.out.println(getClass().getName() + " : Hi I'm the " + name +" age : "+ age+ ".");
	}
	
	private void getUserIn() {
		System.out.println(getClass().getName() + " : Hi I'm the user IN");
	}

	public String getLastName() {
		System.out.println(getClass().getName() + " : getLastName()");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println(getClass().getName() + " : setLastName()");
		this.lastName = lastName;
	}

	public String getFirstName() {
		System.out.println(getClass().getName() + " : getFirstName()");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println(getClass().getName() + " : setFirstName()");
		this.firstName = firstName;
	}

	

	

}
