package com.jj.aspects;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
//@Aspect
public class LogAspect {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	//@Around("execution(* com.jj.service..*.*(..))")
	public Object log(ProceedingJoinPoint proceedingJoinPoint) {
		Object result = null;
		String methodName = proceedingJoinPoint.getSignature().getName();
		String className =  proceedingJoinPoint.getTarget().getClass().getName();
		try {
			logger.info(className+"：方法"+methodName+"执行开始，参数是"+Arrays.asList(proceedingJoinPoint.getArgs()));
			result = proceedingJoinPoint.proceed();
			logger.info(className+"：方法"+methodName+"执行结束，执行结果是"+result);
		} catch (Throwable e) {
			e.printStackTrace();
			logger.info(className+"：方法"+methodName+"执行异常，执行结果是"+e.getMessage());
		}
		return result;
	}

}
