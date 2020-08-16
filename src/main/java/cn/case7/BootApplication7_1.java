package cn.case7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 17:27
 */
//@Import(MyImportSelector.class)
@EnableMyImport(name = "BootApplication7_1")
@EnableMyImportBeanDefinition(name = "BootApplication7_1")
@EnableEcho(packages = "cn.case6")
@EnableConfigurationProperties
//没有异步 因为没有启用
public class BootApplication7_1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootApplication7_1.class, args);
        Case7Config case7Config = context.getBean(Case7Config.class);
        System.out.println(case7Config.getEnable());

        AsyncBean asyncBean = context.getBean(AsyncBean.class);
        asyncBean.async();
        System.out.println("====end====");

        System.out.println(context.getBean("cat"));
        context.close();
    }
}
