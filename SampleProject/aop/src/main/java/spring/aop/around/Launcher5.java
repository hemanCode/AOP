package spring.aop.around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.around.app.AppConfiguration;
import spring.aop.around.dao.UserDAO;


public class Launcher5 {

	public static void main(String[] args) {

		//Create context using annotation based configuration.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		//Get user bean
		UserDAO  theUser = context.getBean("userDAO", UserDAO.class);

		boolean flag = true;
		String data=null;
		try {
			data = theUser.users(flag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Main Classs "+e.getMessage());
		}

		System.out.println(data);
	}
}
