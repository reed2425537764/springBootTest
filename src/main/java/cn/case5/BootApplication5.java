package cn.case5;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/15 11:57
 */
@ComponentScan
public class BootApplication5 {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootApplication5.class);
        springApplication.setAdditionalProfiles("sit");
//        springApplication.setAdditionalProfiles("dev");
        ConfigurableApplicationContext applicationContext = springApplication.run(args);

        System.out.println(applicationContext.containsBean("bean1"));
        System.out.println(applicationContext.containsBean("bean2"));
        System.out.println(applicationContext.containsBean("bean3"));

        if (applicationContext.containsBean("case5Properties")) {
            Case5Properties bean = applicationContext.getBean(Case5Properties.class);
            System.out.println(bean.getIp());
        }
        applicationContext.close();
    }
}
