package spring.aop.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AspectLogging2 {
	
	//Before 
	//Use of point cut method name.
	@Before("spring.aop.pointcut.aspect.Aspects.excludeNoGettersNoSetter()")
	public void beforeUserBackgroundCheck() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice for checking of a user.");
	}



}
