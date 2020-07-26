package spring.aop.accessMethodParams.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectLogging {

	//Before 
	//Use of point cut method name.
	@Before("spring.aop.accessMethodParams.aspect.Aspects.excludeNoGettersNoSetter()")
	public void beforeGetUser(JoinPoint thejointpoint) {
		//Get Method Signature
		System.out.println("==>>  @Before Method");
		MethodSignature methodSignature = (MethodSignature) thejointpoint.getSignature();
		
		System.out.println(methodSignature);
		
		Object[] args = thejointpoint.getArgs();
		
		for(Object arg : args) {
			System.out.println(arg.toString());
			
			if(arg instanceof String) {
				
				System.out.println(arg.toString());
			}
		}
	}

}
