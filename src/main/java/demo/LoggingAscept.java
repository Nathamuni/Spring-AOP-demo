package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAscept {

    @Before("execution(* demo.ShoppingCart.checkout(String))")
    public void beforelogger(){
        System.out.println("B4 Loggers");
    }
//  * FOR ANY RETURNTYPE
//  * FOR ANY PACKAGE
//  * FOR ANY CLASS
//  .. FOR ALL TYPES OF PARAMS

    @After("execution(* *.*.checkout(..))")
    public void afterlogger(){
        System.out.println("After Loggers");
    }
}
