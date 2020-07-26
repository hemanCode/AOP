package spring.aop.after.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	private String lastName;
	private String firstName;
	public UserDAO() {
		//	Default
	}


	public UserDAO(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public void users() {
		System.out.println(getClass().getName() + " : Hi I'm the " + firstName +" "+ lastName+".");
	}

	public String getLastName(String str) throws Exception{
		System.out.println(getClass().getName() + " : getLastName()");
		if(!str.equalsIgnoreCase("a")) {
			throw new NullPointerException("My Custom Exception");
		}
		
		
		return lastName;
	}

	public String setLastName(String lastName) {
		System.out.println(getClass().getName() + " : setLastName()");
		return  lastName;
	}

	public String getFirstName() {
		System.out.println(getClass().getName() + " : getFirstName()");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println(getClass().getName() + " : setFirstName()");
		this.firstName = firstName;
	}


	@Override
	public String toString() {
		return "UserDAO [lastName=" + lastName + ", firstName=" + firstName + "]";
	}





}
