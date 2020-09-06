package cn.case11;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: shiyuqin
 * @Date: 2020/9/6 16:51
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut(value = "execution(* cn.case11.Bean1.fun())")
    public void pointcut() {

    }

    @Before(value = "pointcut()")
    public void before() {
        System.out.println("before");
    }

    @After(value = "pointcut()")
    public void after(JoinPoint jp) {
        Signature signature = jp.getSignature();
        System.out.println(signature.getName());
        System.out.println(signature.getDeclaringTypeName());
        System.out.println(signature.getDeclaringType().getSimpleName());
        System.out.println(Arrays.toString(jp.getArgs()));
    }
}
