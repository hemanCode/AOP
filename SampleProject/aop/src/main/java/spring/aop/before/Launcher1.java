package spring.aop.before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.before.app.AppConfiguration;
import spring.aop.before.dao.UserDAO;
import spring.aop.before.dao.UserDAO2;

public class Launcher1 {

	public static void main(String[] args) {

		//Create context using annotation based configuration.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		//Get user bean
		UserDAO  theUser = context.getBean("userDAO", UserDAO.class);

		theUser.getUser("MyUser");
		theUser.getUser("MyUser",20);

		UserDAO2  theUser2 = context.getBean("userDAO2", UserDAO2.class);
		theUser2.getUser();
	}
}
