package cn.case7;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 21:23
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EchoImportBeanDefinitionRegistrar.class)
/*
* @Import放在启动类可以注入EchoImportBeanDefinitionRegistrar
* 但是通过再一次的封装，EchoImportBeanDefinitionRegistrar中可以拿到packages数组，也就是可以拿到用户定义的东西
* */
public @interface EnableEcho {
    String[] packages();
}
