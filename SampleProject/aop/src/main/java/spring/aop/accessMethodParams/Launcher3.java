package spring.aop.accessMethodParams;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.accessMethodParams.app.AppConfiguration;
import spring.aop.accessMethodParams.dao.UserDAO;


public class Launcher3 {

	public static void main(String[] args) {

		//Create context using annotation based configuration.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		//Get user bean
		UserDAO  theUser = context.getBean("userDAO", UserDAO.class);

		theUser.addUser("MyUser");
		theUser.addUser("My-User",20);

		theUser.setFirstName("My Name");
		theUser.getFirstName();
		
	}
}
