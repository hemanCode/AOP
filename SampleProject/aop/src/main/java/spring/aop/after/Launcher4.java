package spring.aop.after;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import spring.aop.after.app.AppConfiguration;
import spring.aop.after.dao.UserDAO;


public class Launcher4 {

	public static void main(String[] args) {

		//Create context using annotation based configuration.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		//Get user bean
		UserDAO  theUser = context.getBean("userDAO", UserDAO.class);

		theUser.setFirstName("F_Name");
		System.out.println(theUser.setLastName("L_Name"));
		theUser.getFirstName();
		System.out.println("Main Class---------------");
		try {
			theUser.getLastName("My Last Name");
		} catch (Exception e) {

		}
		theUser.users();

	}
}
