package spring.service.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogAdvice implements MethodBeforeAdvice {
	
	//Method
	//==>타겟객체의 Method를 호출 전 호출되는 before() Method 구현
	public void before(Method method, Object[] args, Object target) throws Throwable{
		
		System.out.println("\n=============================");
		System.out.println("[before LOG]"+getClass()+".before() start...");
		System.out.println("[before LOG]targetObject call Method:"+method);
		if (args.length != 0) {
			System.out.println("[before LOG]targetObject method 전달 argument:"+args[0]);
		}
		System.out.println("[before LOG]"+getClass()+".befroe() end...");
	}

}
