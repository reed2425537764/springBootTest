package cn.case12;

import cn.case2.EnableTomDog;
import cn.case2.TomDog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: shiyuqin
 * @Date: 2020/9/12 15:23
 */
/*
* 实现自己的自动配置 (xxx-spring-boot-start)
* */
@EnableAutoConfiguration
@EnableTomDog
public class BootApplication12 {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootApplication12.class);
        springApplication.setAdditionalProfiles("case12");
        ConfigurableApplicationContext applicationContext = springApplication.run(args);
        TomDog tomDog = applicationContext.getBean(TomDog.class);
        System.out.println("tomDog = " + tomDog);

        applicationContext.close();
    }
}
