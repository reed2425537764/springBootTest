package cn.case2;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 14:57
 */
public class BootApplication2_1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BootApplication2.class, args);
        System.out.println(applicationContext.getBean(Phone.class));
        System.out.println(applicationContext.getBean(Cat.class));
        applicationContext.close();
    }
}
