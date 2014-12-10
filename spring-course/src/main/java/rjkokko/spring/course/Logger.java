/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjkokko.spring.course;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *
 * @author riku
 */
@Aspect
public class Logger {
    @Around(" execution(* billCustomer(..))")
    public Object log(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Loging...");
        Object rt = point.proceed();
        return rt;
    }
}
