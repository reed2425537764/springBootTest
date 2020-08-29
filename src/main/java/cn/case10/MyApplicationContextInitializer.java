package cn.case10;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/23 17:58
 */
@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(applicationContext);
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
