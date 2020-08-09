package cn.case3;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 15:20
 */
//读取配置文件
@ComponentScan
public class BootApplication3 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BootApplication3.class, args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //读取配置文件 方法一
        System.out.println(environment.getProperty("local.ip"));
        System.out.println(environment.getProperty("name"));

        //方法二
        Case3Config config = applicationContext.getBean(Case3Config.class);
        System.out.println(config.getIP());

        //方法三
        System.out.println(config.ip);

        //指定配置文件
        MyConfig myConfig = applicationContext.getBean(MyConfig.class);
        System.out.println(myConfig.city);
        System.out.println(myConfig.phone);

        //指定前缀
        DatasourceConfig datasourceConfig = applicationContext.getBean(DatasourceConfig.class);
        System.out.println(datasourceConfig.driverClassName);
        System.out.println(datasourceConfig.username);
        System.out.println(datasourceConfig.url);

        applicationContext.close();
    }
}
