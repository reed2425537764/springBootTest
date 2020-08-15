package cn.case6;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/15 14:48
 */
@ComponentScan
public class BootApplication6 {
    public static void main(String[] args) {
        //ConfigurableApplicationContext applicationContext = SpringApplication.run(BootApplication6.class, args);
        SpringApplication springApplication = new SpringApplication(BootApplication6.class);
        springApplication.setAdditionalProfiles("case5");
        ConfigurableApplicationContext applicationContext = springApplication.run(args);

        System.out.println(System.getProperty("file.encoding"));
        Map<String, EncodingConvert> beans = applicationContext.getBeansOfType(EncodingConvert.class);
        System.out.println("beans = " + beans);

        System.out.println(applicationContext.containsBean("cat"));
        new Thread(((Runnable) applicationContext.getBean("runnable"))).start();
        new Thread(((Runnable) applicationContext.getBean("runnable1"))).start();
        applicationContext.close();
    }
}
