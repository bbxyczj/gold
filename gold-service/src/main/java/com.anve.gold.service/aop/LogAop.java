package com.anve.gold.service.aop;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * created by zhengliu on 2018/5/30
 */
@Component
@Aspect
public class LogAop {

    private static final Logger log= LogManager.getLogger(LogAop.class);


    private static final String pointCut="execution(* com.anve.gold.service.logic.impl.*.*(..))";


    @Pointcut(pointCut)
    private void pointCut(){}

    @Before(pointCut)
    public void before(JoinPoint joinPoint){
        log.info("before Logic:{} ,Method:{} ,Args:{}",joinPoint.getTarget().getClass().getName()
        ,joinPoint.getSignature().getName(), JSON.toJSONString(joinPoint.getArgs()));
    }
    @AfterReturning(value = "pointCut()", returning = "result")
    public void after(JoinPoint joinPoint,Object result){
        log.info("after Logic:{}, Method:{} ,Result:{}",
                joinPoint.getTarget().getClass().getName(),
                joinPoint.getSignature().getName(),
                JSON.toJSONString(result));
    }


}
