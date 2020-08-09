package cn.case1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class TestAspect {

    private final static Logger logger = LoggerFactory.getLogger(TestAspect.class);

    //@Pointcut("execution(public * cn.case1.web.*.*(..))")
    @Pointcut("execution(* cn.case1.web.*.*(..))")
    public void pt1() {

    }

    @Before("pt1()")
    public void before() {
        System.out.println("before");
    }

    @After("pt1()")
    public void after(JoinPoint joinPoint) {
        logger.info("class={}", joinPoint.getSignature().getDeclaringTypeName());
        logger.info("method={}", joinPoint.getSignature().getName());

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        logger.info("ip={}", request.getRemoteAddr());
    }

    @AfterReturning(returning = "object", pointcut = "pt1()")
    public void afterReturning(Object object) {
        System.out.println(object);
    }
}
