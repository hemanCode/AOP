package spring.aop.after.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {


	
	//It's only for happy path for handle exception the use @AfterThrowing

		//Method specific.
		//Point cut expression format [execution("modifier? return type? method Name?")]
		@After("execution(public void spring.aop.after.dao.*.users())")
		public void afterFinallyGetUser() {
			//This block runs before mentioned method
			System.out.println("==> Hi I'm @AfterReturning advice for finally users().");
		}
	//Here write your advises

	//Method specific.
	//Point cut expression format [execution("modifier? return type? method Name?")]
	@AfterReturning("execution(public void spring.aop.after.dao.*.users())")
	public void afterGetUser() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @AfterReturning advice for users(--).");
	}

	//Method specific.
	//Point cut expression format [execution("modifier? return type? method Name?")]
	@AfterReturning(pointcut="execution(* spring.aop.after.dao.*.*(*))",
			returning = "result")
	public void afterGetUserWithParam(JoinPoint theJoinPoint , String result) {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @AfterReturning advice for users() with param.");

		MethodSignature signature = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("==> Signature "+signature);

		Object[] args = theJoinPoint.getArgs();

		for(Object arg : args) {
			System.out.println("==> Argumnts "+arg); 
			result = "My New Data";
		}
	}

	//Method specific.
	//Point cut expression format [execution("modifier? return type? method Name?")]
	@AfterThrowing(pointcut="execution(* spring.aop.after.dao.*.*(*))",
			throwing = "exc")
	public void afterGetUserWithParamException(JoinPoint theJoinPoint , Throwable exc) {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @AfterReturning advice Exception for users() with Null Exception.");
		System.out.println("Exception : " + exc);

	}


}
