package cn.case7;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 19:26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableMyImportBeanDefinition {
    String name();
}
