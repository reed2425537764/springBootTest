package cn.case4;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 20:50
 */
@ComponentScan
public class BootApplication4 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootApplication4.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        PropertySource<?> my = environment.getPropertySources().get("my");
        Object port = my.getProperty("case4Port");
        System.out.println("case4Port = " + port);

        Case4Config case4Config = context.getBean(Case4Config.class);
        System.out.println(case4Config.getCase4Port());
        context.close();
    }
}
