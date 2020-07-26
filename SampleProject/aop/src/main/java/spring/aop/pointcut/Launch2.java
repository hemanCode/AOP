package spring.aop.pointcut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.pointcut.app.AppConfiguration;
import spring.aop.pointcut.dao.UserDAO;
import spring.aop.pointcut.dao.UserDAO2;

public class Launch2 {

	public static void main(String[] args) {
		
		//Create context using annotation based configuration.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		//Get user bean
		UserDAO  theUser = context.getBean("userDAO", UserDAO.class);
		
		theUser.addUser("MyUser");
		theUser.addUser("MyUser",20);
		
		//Set names
		theUser.setFirstName("F_NAME");
		theUser.setFirstName("L_Name");
		
		//Get names
		theUser.getFirstName();
		theUser.getLastName();
		
		UserDAO2  theUser2 = context.getBean("userDAO2", UserDAO2.class);
		theUser2.user();
	}

}
