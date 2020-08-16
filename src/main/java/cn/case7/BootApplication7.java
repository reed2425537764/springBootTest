package cn.case7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 10:39
 */
//@ComponentScan
@Import({Case7Config.class, AsyncBean.class})  //用来导入一个或多个配置类(配置类中的bean会注入容器)或类(被spring容器托管)
//@EnableAutoConfiguration  //启用特性 比如下面两个
@EnableConfigurationProperties  //启用配置属性与@ConfigurationProperties配合使用
@EnableAsync //启用异步与@Async配合使用
public class BootApplication7 {
    /*
    * @Enable* 内部其实是引入配置类(@Import)
    * */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootApplication7.class, args);
        Case7Config case7Config = context.getBean(Case7Config.class);
        System.out.println(case7Config.getEnable());

        AsyncBean asyncBean = context.getBean(AsyncBean.class);
        asyncBean.async();
        System.out.println("====end====");
        context.close();
    }
}
