package spring.service.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/*
 * FileName : TestAdvice.java :: 아래의 4EA Advice interface를 구현
 *  org.springframework.aop.MethodBeforeAdvice
 *  org.springframework.aop.AfterReturningAdvice
 *  org.springframework.aop.ThrowsAdvice
 *  org.aopalliance.intercept.MethodInterceptor
 * ======================================================================
 * AOP 용어정리 :: TargetObject / Adivce / Join Point /Point Cut
 * ======================================================================
 */
public class TestAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor{
	//==> Target Object Method 호출 전 :: before() Method 구현
	
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[before LOG]" + getClass()+".before() start......");
		System.out.println("[before LOG] tagetObjcet call Method : " + method );
		if(args.length != 0) {
			System.out.println("[before LOG] tagetOvject method 전달 argument:"+args[0]);
		}
		System.out.println("[before LOG]" + getClass()+".before() end......");
			
	}
	
	//==> Target Object Method 호출 후 :: afterReturning() Method 구현
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[after LOG]" + getClass()+".arterReturning() start......");
		System.out.println("[after LOG] tagetObect call Method : " + method);
		System.out.println("[after LOG] 타겟 객체의 호출후 return value : " + returnValue);
		System.out.println("[after LOG]" + getClass()+".arterReturning() end......");
	}
	
	//==> Target Object Method 호출 전/후 :: invoke() Method 구현
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[Around before]" + getClass()+".invoke() start......");
		System.out.println("[Around before] tagetObject call Method : " + invocation.getMethod());
		if(invocation.getArguments().length != 0) {
			System.out.println("[Around before] tagetOvject method 전달 argument:" + invocation.getArguments()[0]);
		}
		//==>targetObject Method call
		Object obj = invocation.proceed();
		
		System.out.println("[Around after] 타겟 객체의 호출후 return value : "+obj);
		System.out.println("[Around after]" + getClass()+".invoke() end......");
		
		return obj;
	}
	
	//==> Target Object Method 호출 Exception 발생 : afterThrowing() method 구현
	public void afterThrowing(Throwable throwable) {
		System.out.println("[exception]" + getClass()+".afterThrowing() start......");
		System.out.println("[exception] Exception 발생.......");
		System.out.println("[exception] Exception Message : " + throwable.getMessage());
		System.out.println("[exception]" + getClass()+".afterThrowing() end......");
	}

}
