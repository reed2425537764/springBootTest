package cn.case6;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/15 14:52
 */
//@Conditional基于条件的主动配置 配合Condition接口一起使用
//可以用方法上或者类上
@SpringBootConfiguration
public class Case6Config {

    @Bean
    @Conditional(GBKCondition.class)
    public GBKEncodingConvert gbkEncodingConvert() {
        return new GBKEncodingConvert();
    }

    @Bean
    @Conditional(UTF8Condition.class)
    public UTF8EncodingConvert utf8EncodingConvert() {
        return new UTF8EncodingConvert();
    }

    @Bean
    //spring boot 封装了很多@Condition注解 方便使用
    @ConditionalOnProperty(value = "cat.enable", havingValue = "true", matchIfMissing = true)//matchIfMissing为property不存在时返回true
    public Cat cat() {
        return new Cat();
    }

    @Bean
    @ConditionalOnClass(value = {UTF8EncodingConvert.class})
    public Runnable runnable() {
        return ()->{
            System.out.println("UTF8EncodingConvert is running");
        };
    }

    @Bean
    @ConditionalOnMissingBean(name = {"user"})
    public Runnable runnable1() {
        return ()->{
            System.out.println("user is not running");
        };
    }
}
