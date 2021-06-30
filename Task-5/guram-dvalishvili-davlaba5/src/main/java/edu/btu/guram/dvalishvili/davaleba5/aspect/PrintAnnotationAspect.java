package edu.btu.guram.dvalishvili.davaleba5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(edu.btu.guram.dvalishvili.davaleba5.aspect.Println) && args(x, y)")
    public void myAdvice(JoinPoint joinPoint, int x, int y){
        Object[] receivedArgs = joinPoint.getArgs();
        for (Object arg: receivedArgs) {
            System.out.println("Received argument: " + arg);
        }
    }
}
