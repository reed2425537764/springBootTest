package cn.case7;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 21:24
 */
public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> map = importingClassMetadata.getAnnotationAttributes(EnableEcho.class.getName());
        if (map != null) {
            String[] packages = (String[]) map.get("packages");
            if (packages.length > 0) {
                BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
                beanDefinitionBuilder.addPropertyValue("packages", packages);
                registry.registerBeanDefinition("echoBeanPostProcessor", beanDefinitionBuilder.getBeanDefinition());
            }
        }

    }
}
