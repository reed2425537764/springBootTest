package cn.case2;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 12:42
 */
@ComponentScan
public class BootApplication2 {

    @Bean
    public Phone phone() {
        return new Phone();
    }

    public static void main(String[] args) {
        //入口类即为配置类
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BootApplication2_1.class, args);
        System.out.println(applicationContext.getBean(Phone.class));
        System.out.println(applicationContext.getBean(Cat.class));
        applicationContext.close();
    }
}
