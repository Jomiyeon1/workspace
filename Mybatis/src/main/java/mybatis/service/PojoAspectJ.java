package mybatis.service;

import org.aspectj.lang.ProceedingJoinPoint;

public class PojoAspectJ {

	public PojoAspectJ() {
		// TODO Auto-generated constructor stub
		System.out.println(":: PojoAspectJ Default Consturtor");
	}
	
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {		
		System.out.println("\n[Around before] "+getClass()+".invoke() start...");
		System.out.println("\n[Around before] target Object : "+joinPoint.getTarget().getClass().getName());
		System.out.println("\n[Around before] target Object call method : "+joinPoint.getSignature().getName());
		
		if(joinPoint.getArgs().length !=0) {
			System.out.println("\n[Around before] target Object call method Argument"+joinPoint.getArgs()[0]);
		}
		
		Object obj = joinPoint.proceed();
		
		System.out.println("\n[Around before] target Object call return value : "+obj);
		System.out.println("\n[Around before] "+getClass()+".invoke() end...\n");
		return obj;
	}

}
