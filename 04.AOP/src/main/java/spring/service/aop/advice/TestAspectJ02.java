package spring.service.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspectJ02 {

   //ctor
   public TestAspectJ02() {
      System.out.println(":: TestAspectJ02 Default Ctor");
   }

   ////
//   @Pointcut("execution(* *.getMessage(..))")
//   public void work() {
//      System.out.println("work() point call......");
//   }
   ////
   
   @Before("execution(* *.getMessage(..))")
   public void before(JoinPoint joinPoint) {
      System.out.println("[before LOG]"+getClass()+".before() start");
      System.out.println("[before LOG] Å¸°Ù °´Ã¼:" + joinPoint.getTarget().getClass().getName());
      System.out.println("[before LOG] Å¸°Ù °´Ã¼ÀÇ È£ÃâµÈ method:" + joinPoint.getSignature().getName());
      
      if(joinPoint.getArgs().length != 0) {
         System.out.println("[before LOG] Å¸°Ù °´Ã¼ÀÇ È£ÃâµÈ method¿¡ Àü´ÞµÇ´Â ÀÎÀÚ : "+joinPoint.getArgs()[0]);
      }
      System.out.println("[before LOG]"+getClass()+".before() end...");
   
   }
   
   
   @AfterReturning(pointcut="within(spring.service.aop..*)", returning="returnValue")
   public void afterReturning(JoinPoint joinPoint, Object returnValue) {
      System.out.println("[after LOG]"+getClass()+".before() start");
      System.out.println("[after LOG] Å¸°Ù °´Ã¼:" + joinPoint.getTarget().getClass().getName());
      System.out.println("[after LOG] Å¸°Ù °´Ã¼ÀÇ È£ÃâµÈ method:" + joinPoint.getSignature().getName());
      System.out.println("[after LOG] Å¸°Ù °´Ã¼ÀÇ È£Ãâ ÈÄ return value:" + returnValue);
      System.out.println("[after LOG]"+getClass()+".afterReturning() end...");      
   }
   
   
   @Around("execution(* spring.service.aop.*.*(..))")
   public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
      
      System.out.println("[Around before]"+getClass()+".invoke() start");
      System.out.println("[Around before] Å¸°Ù °´Ã¼:" + joinPoint.getTarget().getClass().getName());
      System.out.println("[Around before] Å¸°Ù °´Ã¼ÀÇ È£ÃâµÈ method:" + joinPoint.getSignature().getName());
      
      if(joinPoint.getArgs().length != 0) {
         System.out.println("[Around before] Å¸°Ù °´Ã¼ÀÇ È£ÃâµÈ method¿¡ Àü´ÞµÇ´Â ÀÎÀÚ : "+joinPoint.getArgs()[0]);
      }
      
      Object obj = joinPoint.proceed();
      
      System.out.println("[Around before] Å¸°Ù °´Ã¼ÀÇ È£Ãâ ÈÄ return value:" + obj);
      System.out.println("[Around before]"+getClass()+".invoke() end...");   
      
      return obj;
   }
   
   
   @AfterThrowing(pointcut="execution (public * *(..))", throwing="throwable")
   public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {
      
      System.out.println("[exception]"+getClass()+".invoke() start");
      System.out.println("[exception] Å¸°Ù °´Ã¼:" + joinPoint.getTarget().getClass().getName());
      System.out.println("[exception] Å¸°Ù °´Ã¼ÀÇ È£ÃâµÈ method:" + joinPoint.getSignature().getName());
      System.out.println("[exception] exception ¹ß»ý");
      System.out.println("[exception] exception message : "+throwable.getMessage());
      System.out.println("[Around before]"+getClass()+".afterThrowing() end...");   
      
   }
}
