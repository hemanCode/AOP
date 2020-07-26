package spring.aop.before.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {


	//Here write your advises

	//Before 
	//Method specific.
	//Point cut expression format [execution("modifier? return type? method Name?")]
	@Before("execution(public void spring.aop.before.dao.UserDAO.getUser())")
	public void beforeGetUser() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice for getUser().");
	}

	//Before 
	//Any Method with name getUser().
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* *getUser())")
	public void beforeAnyGetUser() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice for any getUser().");
	}

	//Before 
	//Any Method start name get*().
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* get*())")
	public void beforeStartAnyGetUser() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice for start with get*().");
	}


	//Before 
	//Any Method which return type is void.
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(void get*())")
	public void beforeReturnTypeVoid() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice which return type is void.");
	}

	//Before 
	//Any Method which return type is any.
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* get*())")
	public void beforeReturnTypeAny() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice which return type is any.");
	}


	//Before 
	//Any Method no argument.
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* get*())")
	public void beforeMethodNoArgument() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice with no argument.");
	}

	//Before 
	//Any Method with one argument as String.
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* get*(String))")
	public void beforeMethodOneArgumentString() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice with one argument as String.");
	}

	//Before 
	//Any Method with one argument of  any
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* get*(*))")
	public void beforeMethodOneArgumentAny() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice with one argument any type.");
	}

	//Before 
	//Any Method with any number argument of  any
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* get*(..))")
	public void beforeMethodAnyArgumentAny() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice with any number argument any type.");
	}

	//Before 
	//Any Method with argument with one String and one int
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* get*(String, int))")
	public void beforeMethodStringIntArgument() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice with argument with one String and one int.");
	}

	//Before 
	//Match with any method of any class in a package with no argument
	//Point cut expression format [execution("return type? method Name?")]
	@Before("execution(* spring.aop.before.dao.*.*())")
	public void beforeMethodanhyClassAnyMethod() {
		//This block runs before mentioned method
		System.out.println("==> Hi I'm @Before advice Match with any method of any class in a package.");
	}

}
