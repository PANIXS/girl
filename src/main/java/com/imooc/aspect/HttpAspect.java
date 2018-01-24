package com.imooc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
        @Pointcut("execution(public * com.imooc.controller.GirlController.*(..))")
        public void log(){
            System.out.println(111111);
        }
        @Before("log()")
        public void doBefore(){
            System.out.println(11111);
        }
        @After("log()")
        public void doAfter(){
            System.out.println(2222);
        }
}
