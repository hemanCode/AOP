package spring.aop.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Aspects {

	//Here write your advises

		@Pointcut("execution(* spring.aop.pointcut.dao.*.*(..))")
		public void forPackage() {}

		//Logical expression

		@Pointcut("execution(* spring.aop.pointcut.dao.*.get*())")
		public void getters() {}
		@Pointcut("execution(* spring.aop.pointcut.dao.*.set*())")
		public void setters() {}


		//
		@Pointcut("forPackage() && !(getters() || setters())")
		public void excludeNoGettersNoSetter() {}

		
}
