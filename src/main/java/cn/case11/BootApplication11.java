package cn.case11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: shiyuqin
 * @Date: 2020/9/6 16:48
 */
@ComponentScan(basePackages = "cn.case11")
@EnableAutoConfiguration
public class BootApplication11 {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootApplication11.class);
        springApplication.setAdditionalProfiles("case11");
        ConfigurableApplicationContext context = springApplication.run(args);
        //JDK动态代理需要根据接口获取对象
        //Bean1 bean1 = context.getBean(Bean1.class);
        IBean1 bean1 = context.getBean(IBean1.class);
        bean1.fun();
        System.out.println(bean1.getClass());
        context.close();
    }
}
