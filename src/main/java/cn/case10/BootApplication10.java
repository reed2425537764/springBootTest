package cn.case10;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/23 17:25
 */
/*
* ApplicationContextInitializer.initialize在容器refresh之前进行回调
* 使用步骤 1.实现ApplicationContextInitializer接口   2.注册ApplicationContextInitializer
* 注册方法 1.SpringApplication.addInitializers   2.spring.factory
*
* CommandLineRunner.run容器启动成功后的最后一步回调
* 使用步骤 1.实现CommandLineRunner接口   2.放入spring容器中
*
* ApplicationRunner与CommandLineRunner相相似
* ApplicationArguments对参数args进一步分装 可以解析--name=value
*
* SpringBootApplication的exclude或excludeName可以排除自动配置的类(需在spring.factories中声明)
* */
@SpringBootApplication(exclude = MyAutoConfig.class)
public class BootApplication10 {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootApplication10.class);
        //注册方法一
//        app.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext applicationContext = app.run(args);
        System.out.println(applicationContext);

        ApplicationArguments applicationArguments = applicationContext.getBean(ApplicationArguments.class);
        System.out.println(applicationArguments.getSourceArgs().length);
        System.out.println(applicationArguments.getOptionValues("name"));
        System.out.println(applicationArguments.getOptionNames());
        System.out.println(applicationArguments.getNonOptionArgs());

        System.out.println(applicationContext.containsBean("bean1"));
        applicationContext.close();
    }
}
