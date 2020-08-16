package cn.case7;

import cn.case6.Cat;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 19:24
 */
//BeanDefinitionRegistry可以往spring容器中注入bean
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println(importingClassMetadata.getAnnotationAttributes(EnableMyImport.class.getName()));
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Cat.class);
        registry.registerBeanDefinition("cat", beanDefinitionBuilder.getBeanDefinition());
    }
}
