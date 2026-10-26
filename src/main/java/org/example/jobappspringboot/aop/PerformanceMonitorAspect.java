package org.example.jobappspringboot.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.jobappspringboot.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
// you can monitor time taken by any method to execute
// you have to uise around here
public class PerformanceMonitorAspect {


    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);
     @Around("execution(*  org.example.jobappspringboot.service.JobService.getJob(..))")
     // means you want start to execute befoire get job and end to  execute after getjob
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {

         long start = System.currentTimeMillis();

         Object obj = jp.proceed();

         long end = System.currentTimeMillis();

         System.out.println("time taken " + (end-start));

         return obj;

     }

}
