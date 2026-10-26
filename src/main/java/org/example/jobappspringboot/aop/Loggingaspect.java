package org.example.jobappspringboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Loggingaspect {
  // aop is campanion of oops and used to auto log things making clean business logic and maintainable code.
    private static final Logger LOGGER = LoggerFactory.getLogger(Loggingaspect.class);

    // this is the advice and we want to execute and when we want this should be define
    // syntak to define in before is return type , class name. method name arguement

    @Before("execution(*  org.example.jobappspringboot.service.JobService.getJob(..))")
    // things inside before called as point cut.
    public void LogMethodcall(){
        LOGGER.info("method called");

    }

     @After("execution(* org.example.jobappspringboot.service.JobService.getJob(..))")
     // after means executed just after the method executed not depend on whether it will crash or not.
     // target object get wrap with proxy object .
    public void logMethodExecuted(JoinPoint jp){
      LOGGER.info("get job method called" + jp.getSignature());

    }

    @AfterThrowing("execution(* org.example.jobappspringboot.service.JobService.getJob(..))")
    public void logMethodCrash(){
      LOGGER.info("Something crashes in method");
    }
}
