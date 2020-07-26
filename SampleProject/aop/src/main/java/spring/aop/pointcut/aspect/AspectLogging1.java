package spring.aop.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectLogging1 {

	//Before 
	//Use of point cut method name.
	@Before("spring.aop.pointcut.aspect.Aspects.excludeNoGettersNoSetter()")
	public void beforeGetUser() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice for addUser().");
	}

}
